var Add_account = Ext.create('Ext.form.Panel', {
	  autoScroll: true,
    title: 'Create Account',
	border:false,
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
		xtype:'textfield',
            allowBlank: false,
            fieldLabel: 'Total number of vechicals',
            name: 'fax',
            inputType: 'number'
            
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
	 buttons: ['->', {
            text: 'Save',
			 handler: function () {
                    Add_account.getForm().submit({
                        url: 'index1.html',
                        standardSubmit: true,
                        method: 'POST'
                    });
                }
        }, {
            text: 'Cancel'
        }]	
	
	
});

