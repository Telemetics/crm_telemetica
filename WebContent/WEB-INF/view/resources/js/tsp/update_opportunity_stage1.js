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

var update_opportunity1 = Ext.create('Ext.grid.Panel', {
   
	 border:false,
    store: Ext.data.StoreManager.lookup('employeeStore'),
    columns: [
        {text: 'Opportunity',  dataIndex:'firstname'},
        
        {
            xtype:'actioncolumn',
            
            items: [{
			icon: 'images/edit_image.png',
                tooltip: 'Edit',
                handler: function(grid, rowIndex, colIndex) {
                    var rec = grid.getStore().getAt(rowIndex);
                    alert("Edit " + rec.get('firstname'));
					update_opportunity1.removeAll(false);
					update_opportunity1.add(update_opportunity2);
				
				    update_opportunity1.doLayout();
                }
            }
			]
        }
    ],
   
    renderTo: Ext.getBody()
});

 
