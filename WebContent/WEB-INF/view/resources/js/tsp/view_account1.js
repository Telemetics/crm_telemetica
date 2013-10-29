Ext.require([
    'Ext.panel.*',
    'Ext.toolbar.*',
    'Ext.button.*',
    'Ext.container.ButtonGroup',
    'Ext.layout.container.Table'
]);
var viewaccount = Ext.create('Ext.Panel', {
   
    title: "View Account",
    layout: {
        type: 'vbox',
        align: 'center'
    },
    renderTo: document.body,
    items: [{
        xtype: 'panel',
        title: 'Account Details',
        width: '100%',
        flex: 2,
            layout: {
        type: 'hbox',
        align: 'stretch'
    },
    renderTo: document.body,
     items: [{
        xtype: 'panel',
        	border:false,
        defaults: {
			 
            width:300,
		    margin:'20 0 0 150',
          },
		 
		 items: [
	  
          {
		    xtype:'textfield',
            allowBlank: false,
            fieldLabel: 'Account Name',
            name: 'customerName',
           width:350,
          },
  {
    xtype: 'combobox',
    editable:true,
    allowBlank: false,
  
    displayField: 'USERTYPE',
            fieldLabel: 'Vertical',

        },         

    {
    xtype: 'combobox',
    editable: true,
   allowBlank: false,
    displayField: 'USERTYPE',
            fieldLabel: 'Type',

        },
		  {
		    xtype     : 'textareafield',
              grow      : true,
            allowBlank: false,
            fieldLabel: 'Description',
			width:350,
            name: 'customerType'
            
            
        },
		
          {
		  xtype:'textfield',
            allowBlank: false,
            fieldLabel: 'Contact Person',
            name: 'customerName',
             width:350,
          },
		{
		xtype:'textfield',
            allowBlank: false,
            fieldLabel: 'Email',
            name: 'email',
			vtype: 'email',
              width:350,
            
        },
		{
		xtype:'textfield',
            allowBlank: false,
            fieldLabel: 'Fax',
            name: 'fax',
            inputType: 'number'
            
        },
		{xtype:'textfield',
            allowBlank: true,
            fieldLabel: 'Telephone Number',
            name: 'moblieNumber1',
            inputType: 'number'
            
        },
		
		{
		xtype:'textfield',
            allowBlank: false,
            fieldLabel: 'Mobile Number',
            name: 'moblieNumber',
            inputType: 'number'
            
        }
			
		]
    },{
        xtype: 'panel',
       	border:false,
		 defaults: {
			 width:300,
		    margin:'25 0 0 150',
          },
		  width:'40%',
        items:[ {
		    xtype     : 'textareafield',
              grow      : true,
            allowBlank: false,
            fieldLabel: 'Address',
			width:350,
            name: 'customerType'
            
            
        },
		
		
		 {
		 xtype:'textfield',
            allowBlank: false,
            fieldLabel: 'Country',
            name: 'country'
            
            
        },
		 {
		 xtype:'textfield',
            allowBlank: false,
            fieldLabel: 'State',
            name: 'state'
            
            
        },
		 {
		 xtype:'textfield',
            allowBlank: false,
            fieldLabel: 'City',
            name: 'city'
            
            
        },
		{
		xtype:'textfield',
            allowBlank: false,
            fieldLabel: 'Pincode',
            name: 'pinCode',
            inputType: 'number'
            
        },
			{
			xtype:'textfield',
            allowBlank: false,
            fieldLabel: 'Zone',
            name: 'pinCode',
          
            
        },
			{
			xtype:'textfield',
            allowBlank: false,
            fieldLabel: 'Region',
            name: 'pinCode',
            
            
        },
			{
			xtype:'textfield',
            allowBlank: false,
            fieldLabel: 'Area',
            name: 'pinCode',
            
            
        },
	
		
		]
    }],
    },
	
    {
        xtype: 'panel',
        title: 'Opportunity',
        width: '100%',
        flex: 4
    },
    {
        xtype: 'panel',
		title: 'Activites',
        width: '100%',
        flex: 4,
		items:[
			 {
			 xtype:'button',
			  margin:'20 0 0 500',
			  text: 'Back',
                handler:
                   function() { 
				   window.location = "index1.html" 
				   }

            }
		]
    }],
});