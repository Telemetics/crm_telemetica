var update_opportunity = Ext.create('Ext.form.Panel', {
    title: 'Update Opportunity',
    bodyPadding: 5,

    border:false,
    layout: 'anchor',
    defaults: {
	  
   
    },

    defaultType: 'textfield',
    items: [{
        fieldLabel: 'Account Name',
        name: '',
        allowBlank: false
    },
	{ 
         xtype:'button',
 anchor: '5%',		 
        text: 'Reset',
        handler: function() {
            this.up('form').getForm().reset();
        }
    }, {
	    xtype:'button',
		anchor: '5%',	
        text: 'Submit',
        formBind: true, //only enabled once the form is valid
        disabled: true,
        handler: function() {
                    //var rec = grid.getStore().getAt(rowIndex);
                    //alert("View" + rec.get('firstname'));
					update_opportunity.removeAll(false);
					update_opportunity.add(update_opportunity1);
				
				    update_opportunity.doLayout();
                }
    }],
    renderTo: Ext.getBody()
});
