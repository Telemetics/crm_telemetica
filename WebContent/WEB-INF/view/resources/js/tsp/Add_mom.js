var add_mom = Ext.create('Ext.form.Panel', {
    title: 'Add MOM',
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
					add_mom.removeAll(false);
					add_mom.add(addmom1);
				
				    add_mom.doLayout();
                }
    }],
    renderTo: Ext.getBody()
});
