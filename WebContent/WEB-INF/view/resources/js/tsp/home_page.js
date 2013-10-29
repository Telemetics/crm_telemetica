

Ext.create('Ext.data.Store', {
    storeId:'sampleStore',
    fields:[
        { name: 'symbol', type: 'string' },
        { name: 'date',   type: 'date' },
        { name: 'change', type: 'number' },
        { name: 'volume', type: 'number' },
        { name: 'topday', type: 'date' }                        
    ],
    data:[
        { symbol: "msft",   date: '2011/04/22', change: 2.43, volume: 61606325, topday: '04/01/2010' },
        { symbol: "goog",   date: '2011/04/22', change: 0.81, volume: 3053782,  topday: '04/11/2010' },
        { symbol: "apple",  date: '2011/04/22', change: 1.35, volume: 24484858, topday: '04/28/2010' },            
        { symbol: "sencha", date: '2011/04/22', change: 8.85, volume: 5556351,  topday: '04/22/2010' }            
    ]
});
var home = Ext.create('Ext.Panel', {
    width: 500,
   
    layout: {
        type: 'vbox',
        align: 'center'
    },
    renderTo: document.body,
    items: [{
        xtype: 'panel',
        title: 'List of Opportunities',
		collapsible:'true',
        width: '100%',
        flex: 4,
		items:[
		Ext.create('Ext.grid.Panel', {
   
    store: Ext.data.StoreManager.lookup('sampleStore'),
    columns: [
          { text: 'slno',   dataIndex: 'symbol'},
		{ text: 'Account name', dataIndex: 'symbol' },
		{ text: 'Opportunity name',   dataIndex: 'symbol' },
		{ text: 'Number of vehicals',   dataIndex: 'symbol' },
        { text: 'Expected ClosureDate',     dataIndex: 'date',   xtype: 'datecolumn',   format:'Y-m-d' },           
    ],
   
    renderTo: Ext.getBody()
}),
		
		
		
		]
		
		
		
    },
    {
        xtype: 'panel',
        title: 'List of support Requested',
		collapsible:'true',
          width: '100%',
        flex: 4,
	items:[
		Ext.create('Ext.grid.Panel', {
   
    //store: Ext.data.StoreManager.lookup('sampleStore'),
    columns: [
          { text: 'slno',   dataIndex: 'symbol'},
		{ text: 'Account name', dataIndex: 'symbol' },
		{ text: 'Opportunity name',   dataIndex: 'symbol' },
		{ text: 'Who',   dataIndex: 'symbol' },
        { text: 'Support Needed',     dataIndex: 'date' },
           { text: 'Status Pending',     dataIndex: 'date' }		
    ],
   
    renderTo: Ext.getBody()
}),
		
		
		
		]
		
    },
    {
        xtype: 'panel',
        title: 'List of Activites Pending',
		collapsible:'true',
           width: '100%',
        flex: 4,
		items:[
		Ext.create('Ext.grid.Panel', {
  
   // store: Ext.data.StoreManager.lookup('sampleStore'),
    columns: [
        { text: 'slno',   dataIndex: 'symbol'},
		{ text: 'Account name', dataIndex: 'symbol' },
		{ text: 'Action',   dataIndex: 'symbol' },
		{ text: 'Who',   dataIndex: 'symbol' },
        { text: 'When',     dataIndex: 'date',   xtype: 'datecolumn',   format:'Y-m-d' },
        { text: 'Status',   dataIndex: 'symbol' },          
    ],
   
    renderTo: Ext.getBody()
}),
		
		
		
		]
		
    }]
});