isc.DataSource.create({
    inheritsFrom:"DataSourceField",
    Constructor:"SimpleType",
    isServerDS:true,
    allowAdvancedCriteria:true,
    addGlobalId:false,
    ID:"SimpleType",
    fields:[
        {
            name:"inheritsFrom",
            type:"string",
            validators:[
            ]
        },
        {
            name:"editorType",
            type:"string",
            validators:[
            ]
        }
    ]
})
