isc.DataSource.create({
    strictValidation:"false",
    isServerDS:true,
    allowAdvancedCriteria:true,
    addGlobalId:"false",
    ID:"Validator",
    fields:[
        {
            type:"string",
            xmlAttribute:"true",
            name:"type",
            validators:[
            ]
        },
        {
            type:"string",
            name:"name",
            validators:[
            ]
        },
        {
            type:"string",
            name:"description",
            validators:[
            ]
        },
        {
            type:"boolean",
            name:"stopIfFalse",
            validators:[
            ]
        },
        {
            type:"boolean",
            name:"stopOnError",
            validators:[
            ]
        },
        {
            type:"boolean",
            name:"validateOnChange",
            validators:[
            ]
        },
        {
            type:"boolean",
            name:"clientOnly",
            validators:[
            ]
        },
        {
            type:"string",
            name:"errorMessage",
            validators:[
            ]
        },
        {
            type:"float",
            name:"max",
            validators:[
            ]
        },
        {
            type:"float",
            name:"min",
            validators:[
            ]
        },
        {
            type:"boolean",
            name:"exclusive",
            validators:[
            ]
        },
        {
            type:"regexp",
            name:"mask",
            validators:[
            ]
        },
        {
            type:"regexp",
            name:"transformTo",
            validators:[
            ]
        },
        {
            type:"integer",
            name:"precision",
            validators:[
            ]
        },
        {
            type:"integer",
            name:"roundToPrecision",
            validators:[
            ]
        },
        {
            type:"string",
            name:"expression",
            validators:[
            ]
        },
        {
            type:"string",
            name:"otherField",
            validators:[
            ]
        },
        {
            multiple:"true",
            type:"text",
            name:"list",
            validators:[
            ]
        },
        {
            type:"ValueMap",
            name:"valueMap",
            validators:[
            ]
        },
        {
            type:"text",
            name:"substring",
            validators:[
            ]
        },
        {
            type:"text",
            name:"operator",
            validators:[
            ]
        },
        {
            type:"integer",
            name:"count",
            validators:[
            ]
        },
        {
            type:"AdvancedCriteria",
            name:"applyWhen",
            validators:[
            ]
        },
        {
            multiple:"true",
            type:"string",
            name:"dependentFields",
            validators:[
            ]
        },
        {
            type:"string",
            name:"scriptImport",
            validators:[
            ]
        },
        {
            type:"boolean",
            name:"caseSensitive",
            validators:[
            ]
        },
        {
            type:"string",
            name:"operationId",
            validators:[
            ]
        },
        {
            idAllowed:"true",
            type:"Object",
            name:"serverCondition",
            validators:[
            ]
        },
        {
            type:"ServerObject",
            name:"serverObject",
            validators:[
            ]
        },
        {
            type:"string",
            xmlAttribute:"true",
            name:"fieldName",
            validators:[
            ]
        },
        {
            type:"string",
            name:"triggerEvent",
            validators:[
            ]
        },
        {
            type:"any",
            xmlAttribute:"true",
            name:"value",
            validators:[
            ]
        },
        {
            type:"string",
            name:"message",
            validators:[
            ]
        },
        {
            type:"string",
            name:"severity",
            validators:[
            ]
        },
        {
            type:"string",
            name:"displayMode",
            validators:[
            ]
        },
        {
            type:"integer",
            name:"duration",
            validators:[
            ]
        },
        {
            type:"string",
            name:"formula",
            validators:[
            ]
        },
        {
            type:"ValueMap",
            name:"formulaVars",
            validators:[
            ]
        }
    ]
})
