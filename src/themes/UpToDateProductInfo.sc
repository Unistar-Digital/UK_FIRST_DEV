theme: /
    state: UpToDateProductInfo
        a: Что Вас интересует?
        buttons: 
            "Советы начинающему инвестору" -> /InvestorAdvice
            "Выбор продукта" -> /ProductChoice
            "Во что инвестируют продукты УК "Первая"?" -> /InvestInWhat
            "Какая динамика доходности у ПИФа за последний год?" -> /PIFDynamics
            "Что сейчас на рынке акций и облигаций + ближайший прогноз" -> /StockForecast
            "Какие налоги нужно платить при получении дохода?" -> /WhatTaxes
            "Назад" -> /Start/MainMenu 
        timeout: /Start/Timeout || interval = "1 hour" 
    
    state: InvestorAdvice
        a: текст
        timeout: /Start/WhatElse || interval = "2 seconds"

    #ВЫБОР ПРОДУКТА
    state: ProductChoice
        a: Какой продукт Вас интересует?
        buttons: 
            "БПИФ" -> /BPIF22
            "ОПИФ" -> /OPIF22
            "ИИС" -> /IIS22
            "Назад" -> /UpToDateProductInfo
        timeout: /Start/Timeout || interval = "1 hour"
    
    state: BPIF22 
        a: текст
        timeout: /Start/WhatElse || interval = "2 seconds"
    
    state: OPIF22
        a: текст
        timeout: /Start/WhatElse || interval = "2 seconds"
    
    state: IIS22
        a: текст
        timeout: /Start/WhatElse || interval = "2 seconds"
    
    #ВО ЧТО ИНВЕСТИРУЮТ ПРОДУКТЫ УК ПЕРВАЯ
    state: InvestInWhat
        a: Что Вас интересует?
        buttons:
            "БПИФ" -> /BPIF23
            "ОПИФ" -> /OPIF23
            "ИИС" -> /IIS23
            "Назад" -> /UpToDateProductInfo
        timeout: /Start/Timeout || interval = "1 hour"
    
    state: BPIF23 
        a: текст
        timeout: /Start/WhatElse || interval = "2 seconds"
    
    state: OPIF23
        a: текст
        timeout: /Start/WhatElse || interval = "2 seconds"
    
    state: IIS23
        a: текст
        timeout: /Start/WhatElse || interval = "2 seconds"

    #КАКАЯ ДИНАМИКА ДОХОДНОСТИ
    state: PIFDynamics
        a: Ознакомиться с динамиками доходности у ПИФов Вы можете по следующим ссылкам:
        buttons:
            {"text": "ПИФ-1", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"} 
            {"text": "ПИФ-N", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
            "Назад" -> /UpToDateProductInfo
        timeout: /Start/Timeout || interval = "1 hour"
    
    #ПРОГНОЗ
    state: StockForecast
        a: Ознакомиться с текущим состоянием рынка и ближайшим прогнозом Вы можете в следующем файле: 
        buttons: 
            {"text": "Состояние рынка и прогноз", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
            "Назад" -> /UpToDateProductInfo
        timeout: /Start/Timeout || interval = "1 hour"        
    
    #НАЛОГИ
    state: WhatTaxes
        a: Я могу Вам рассказать о налогах на доход по следующим категориям:
        buttons: 
            "Налоги ПИФ" -> /PIFTaxes
            "Налоги ДУ" -> /DUTaxes
            "Налоги ИИС" -> /IISTaxes       
            "Назад" -> /UpToDateProductInfo
        timeout: /Start/Timeout || interval = "1 hour"
    
    state: PIFTaxes
        a: текст
        timeout: /Start/WhatElse || interval = "2 seconds"
    
    state: DUTaxes
        a: текст
        timeout: /Start/WhatElse || interval = "2 seconds"
    
    state: IISTaxes
        a: текст
        timeout: /Start/WhatElse || interval = "2 seconds" 
