Ext.create('Ext.data.Store', {
    storeId:'employeeStore',
    fields:['firstname', 'lastname', 'seniority', 'dep', 'hired'],
    data:[
        {firstname:"Michael", lastname:"Scott"},
        {firstname:"Dwight", lastname:"Schrute"},
        {firstname:"Jim", lastname:"Halpert"},
        {firstname:"Kevin", lastname:"Malone"},
        {firstname:"Angela", lastname:"Martin"}
    ]
});

var view_account = Ext.create('Ext.grid.Panel', {
    title: 'Accounts',
	  
    store: Ext.data.StoreManager.lookup('employeeStore'),
    columns: [
        {text: 'First Name',  dataIndex:'firstname'},
        {text: 'Last Name',  dataIndex:'lastname'},
        {
            xtype:'actioncolumn',
            
            items: [{
			icon: 'images/edit_image.png',
                tooltip: 'Edit',
                handler: function(grid, rowIndex, colIndex) {
                    var rec = grid.getStore().getAt(rowIndex);
                    alert("Edit " + rec.get('firstname'));
					view_account.removeAll(false);
					view_account.add(modify_account);
				
				    view_account.doLayout();
                }
            },{
                icon: 'images/delete.png',
                tooltip: 'Delete',
                handler: function(grid, rowIndex, colIndex) {
                    var rec = grid.getStore().getAt(rowIndex);
                    alert("Terminate " + rec.get('firstname'));
                }
            },{
                icon: 'images/view1.png',
                tooltip: 'View',
                handler: function(grid, rowIndex, colIndex) {
                    var rec = grid.getStore().getAt(rowIndex);
                    alert("View" + rec.get('firstname'));
					view_account.removeAll(false);
					view_account.add(viewaccount);
				
				    view_account.doLayout();
                }
            }
			]
        }
    ],
    width: 400,
    renderTo: Ext.getBody()
});

 
