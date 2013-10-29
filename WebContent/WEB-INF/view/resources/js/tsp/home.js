



Ext.require([
    'Ext.panel.*',
    'Ext.toolbar.*',
    'Ext.button.*',
    'Ext.container.ButtonGroup',
    'Ext.layout.container.Table'
]);
Ext.application({
    requires: ['Ext.container.Viewport'],
    name: 'AM',

    appFolder: 'app',
	launch: function() {
	Ext.QuickTips.init();
	
 


var image = Ext.create('Ext.Img', {
    src: "resources/images/telematics4u_logo.jpg",
    renderTo: document.body,
	height:100,
	width:300,
  
});

    
 var toolbar= Ext.create('Ext.toolbar.Toolbar', {
    renderTo: document.body,
    width   : '100%',
	  
    items: [
	{
	xtype:'button',
	text:'Home',
	handler:function()
				{
				resultsPanel.removeAll(false);
				resultsPanel.add(home);
				resultsPanel.doLayout();
				},
	},
        {
            xtype: 'splitbutton',
            text : 'Account',
			    menu: [
				{
				text: 'Create Account',
				handler:function()
				{
				resultsPanel.removeAll(false);
				resultsPanel.add(Add_account);
				resultsPanel.doLayout();
				},
				},
				{
				text: 'Update Account',
				handler:function()
				{
					resultsPanel.removeAll(false);
				resultsPanel.add(view_account);
				resultsPanel.doLayout();
				},
				},
				{
				text: 'Create MOM',
				handler:function()
				{
					resultsPanel.removeAll(false);
				resultsPanel.add(add_mom);
				resultsPanel.doLayout();
				},
				},
				]
        
        },
		
		{
            xtype: 'splitbutton',
            text : 'Opportunity',
			menu: [
				{
				text: 'Create Opportunity',
				handler:function()
				{
				resultsPanel.removeAll(false);
				resultsPanel.add(add_opportunity);
				resultsPanel.doLayout();
				},
				},
				{
				text: 'Update Opportunity',
			handler:function()
				{
				resultsPanel.removeAll(false);
				resultsPanel.add(update_opportunity);
				resultsPanel.doLayout();
				},
					 },
					 {
				text: 'Request Support',
				handler:function()
				{
				resultsPanel.removeAll(false);
				resultsPanel.add(request_support);
				resultsPanel.doLayout();
				},
                  
				     }
				]
        },
		
		{
            xtype: 'button',
            text : 'Reports',
			
			
        },
		
        // begin using the right-justified button container
       {xtype: 'tbspacer', 
		
		width: 500},
       
       
        
		// add a 50px space
   {
      xtype: 'panel',
      html:'<a href="index.html">Logout</a>',
}  
	]
	
});
var resultsPanel = Ext.create('Ext.panel.Panel', {
    autoscroll:true,
    border:false,
    renderTo: document.body,
    layout: {
        type: 'vbox',       // Arrange child items vertically
        align: 'stretch',    // Each takes up full width
        padding: 5
    }
    
});

 }
});

