var update_opportunity2 = Ext.create('Ext.form.Panel', {

    bodyPadding: 5,
    width: 350,
    border:false,
    layout: 'anchor',
    defaults: {
        anchor: '30%'
    },

    defaultType: 'textfield',
    items: [{
        fieldLabel: 'Account Name',
        name: '',
        allowBlank: false
    },
	{
        fieldLabel: 'Opportunity Name',
        name: '',
        allowBlank: false
    },
    {
        fieldLabel: 'Vertical',
        name: 'last',
        allowBlank: false
    },
	{
	    xtype     : 'textareafield',
        grow      : true,
        fieldLabel: 'Description',
        name: '',
        allowBlank: false
    },
	{
        fieldLabel: 'Number of vehicals',
        name: 'last',
		inputType: 'number',
        allowBlank: false
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
            
        },
	
	{
        xtype: 'datefield',
       
        fieldLabel: 'Expected colsure Date',
        name: '',
        value: '', // defaults to today
    },
		{
        fieldLabel: 'Remarks',
        name: '',
        allowBlank: false
    }
	],

 
    buttons: [{
        text: 'Reset',
        handler: function() {
            this.up('form').getForm().reset();
        }
    }, {
        text: 'Submit',
        formBind: true, //only enabled once the form is valid
        disabled: true,
        handler: function() {
            this.up('form').getForm().submit({
                        url: 'index1.html',
                        standardSubmit: true,
                        method: 'POST',  
        });
		}
    }],
});

