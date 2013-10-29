 var addmom1 = Ext.create('Ext.form.Panel', {
    margin:'0 50 50 0',
    border:false,
    layout: {
        type: 'vbox',
        align: 'center'
    },
    renderTo: document.body,
    items: [{
        xtype: 'panel',
      border:false,
        width: '100%',
         items: [{
        xtype: 'datefield',
       
        fieldLabel: 'Meeting Date',
        name: '',
        value: '', 
    },
	{
        xtype: 'textfield',
       
        fieldLabel: 'Members Present',
        name: '',
       width:500,
    }
		
		 
		 ],
    },

    {
        xtype: 'panel',
		layout:'hbox',
       border:false,
        width: '100%',
		
		items:[
		{
		xtype:'textfield',
		fieldLabel:'Slno',
		width:200,
		
		},
		{
		xtype:'textfield',
		fieldLabel:'Action',
		width:200,
		margin:'0 23 23 5',
		},
		{
		xtype:'textfield',
		fieldLabel:'Who',
		width:200,
		margin:'0 23 23 5',
		},
		{
		 xtype: 'datefield',
       
        fieldLabel: 'Meeting Date',
        name: '',
        value: '', 
		margin:'0 23 23 5',
		width:200,
		
		},{
		xtype:'combobox',
		fieldLabel:'Status',
		
		width:200,
		
		}],
		},
		{
        xtype: 'panel',
      border:false,
	  layuot:'vbox',
        width: '100%',
         items: [
	{
        xtype: 'textarea',
       
        fieldLabel: 'Comment',
        name: '',
       width:500,
    }
		
		 
		 ],
    }
	
		
	
        
    ],
	buttons: ['->', {
            text: 'Save'
        }, {
            text: 'Cancel'
        }],
	
});
      
  