var request_support1 = Ext.create('Ext.form.Panel', {
    
    bodyPadding: 5,
    width: 350,

    layout: 'anchor',
    defaults: {
        anchor: '30%'
    },

    defaultType: 'textfield',
    items: [
		{
        fieldLabel: 'Account Name',
        name: 'last',
        allowBlank: false
    },
		{
        fieldLabel: 'Opportunity',
        name: 'last',
        allowBlank: false
    },
	
	
	{
        xtype      : 'fieldcontainer',
            fieldLabel : 'Whom',
            defaultType: 'radiofield',
            defaults: {
                flex: 1
            },
            layout: 'hbox',
             items: [
                {
                    boxLabel  : 'PMO',
                    name      : 'size',
                    inputValue: '1',
                    id        : 'radio1'
                }, {
                    boxLabel  : 'CRC',
                    name      : 'size',
                    inputValue: '1',
                    id        : 'radio2'
                }
            ]
				},	
					
					{
					 xtype     : 'textareafield',
              grow      : true,
        fieldLabel: 'What Support Needed',
        name: 'last',
        allowBlank: false
    }],

    
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
            var form = this.up('form').getForm();
            if (form.isValid()) {
                form.submit({
                    success: function(form, action) {
                       Ext.Msg.alert('Success', action.result.msg);
                    },
                    failure: function(form, action) {
                        Ext.Msg.alert('Failed', action.result.msg);
                    }
                });
            }
        }
    }],
    renderTo: Ext.getBody()
});