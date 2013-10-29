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



var request_support = Ext.create('Ext.grid.Panel', {
    title: 'Request Support',
	border:false,
    store: Ext.data.StoreManager.lookup('employeeStore'),
    columns: [
        {text: 'Account Name',  dataIndex:'firstname'},
        {text: 'Opportunity',  dataIndex:'lastname'},
        {
            xtype:'actioncolumn',
            
            items: [{
			icon: 'images/request.png',
                tooltip: 'Request',
                handler: function(grid, rowIndex, colIndex) {
                    var rec = grid.getStore().getAt(rowIndex);
                    alert("Edit " + rec.get('firstname'));
					request_support.removeAll(false);
					request_support.add(request_support1);
				
				    request_support.doLayout();
                }
            }
			]
        }
    ],
    width: 400,
    renderTo: Ext.getBody()
});

 
