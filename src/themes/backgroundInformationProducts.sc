theme: /
    state: BackgroundInformationProducts
        a: Что Вас интересует? 
        buttons:
            "Какие есть продукты?" -> /Products
            "Какие документы нужны для старта инвестирования?" -> /Documents1
        timeout: /Start/Timeout || interval = "1 hour"
    
    state: Products
        a: Могу проконсультировать Вас по следующим тематикам:
        buttons:
            "Открытые паевые фонды" -> /OpenEndedMutualFunds
            "Биржевые фонды" -> /ExchangeTradedFunds
            "Индивидуальный инвестиционный счет" -> /IIS
            "Доверительное управление" -> /RubleStrategies
        timeout: /Start/Timeout || interval = "1 hour"
    
    #ОТКРЫТЫЕ ПАЕВЫЕ ФОНДЫ
    state: OpenEndedMutualFunds
        a: Выберите категорию среди открытых паевых фондов
        buttons:
            "Открытые фонды облигаций" -> /OpenBondsFunds
            "Открытые фонды акций" -> /OpenStocksFunds
            "Открытые фонды смешанных инвестиций" -> /MixedInvestmentsFunds
            "Закрытые фонды" -> /ClosedFunds
        timeout: /Start/Timeout || interval = "1 hour"
    
    #ОТКРЫТЫЕ ФОНДЫ ОБЛИГАЦИЙ
    state: OpenBondsFunds
        a: Какой вид фондов Вас интересует? 
        buttons:
            "Фонд облигаций с выплатой дохода" -> /OpenBondsFunds/IncomePayingBondFund
            "Фонд консервативный с выплатой дохода" -> /OpenBondsFunds/ConservativeIncomeBondFund
            "Фонд российских облигаций" -> /OpenBondsFunds/RussianBondFund
            "Фонд Валютные сбережения" -> /OpenBondsFunds/CurrencyBond
            "Фонд Накопительный" -> /OpenBondsFunds/CumulativeFunds
        timeout: /Start/Timeout || interval = "1 hour"

        state: IncomePayingBondFund
            a: По теме облигаций с выплатой дохода я могу предложить Вам следующие виды документов
            buttons:
                {"text": "Информационный лист Фонд облигаций с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"} 
                {"text": "Презентация Фонд облигаций с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Фонд облигаций с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"} 
                {"text": "Презентация_Сбер1 Фонд облигаций с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"} 
            timeout: /Start/WhatElse || interval = "30 seconds" 
        
        state: ConservativeIncomeBondFund
            a: По теме консервативного фонда с выплатой дохода могу предложить Вам следующие виды документов
            buttons:
                {"text": "Информационный лист Фонд консервативный с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"} 
                {"text": "Презентация Фонд консервативный с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Информационный лист_Сбер1 Фонд консервативный с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"} 
                {"text": "Презентация_Сбер1 Фонд консервативный с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"} 
            timeout: /Start/WhatElse || interval = "30 seconds" 
        
        state: RussianBondFund
            a: По теме фонда российских облигаций могу предложить Вам следующие виды документов
            buttons:
                {"text": "Информационный лист Фонд российских облигаций", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"} 
                {"text": "Презентация Фонд российских облигаций", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Информационный лист_Сбер1 Фонд российских облигаций", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"} 
                {"text": "Презентация_Сбер1 Фонд российских облигаций", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"} 
            timeout: /Start/WhatElse || interval = "30 seconds" 
        
        state: CurrencyBond
            a: По теме фонда валютных сбережений могу предложить Вам следующие виды документов
            buttons:
                {"text": "Информационный лист Фонд Валютные сбережения", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"} 
                {"text": "Презентация Фонд Валютные сбережения", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Информационный лист_Сбер1 Фонд Валютные сбережения", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"} 
                {"text": "Презентация_Сбер1 Фонд Валютные сбережения", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"} 
            timeout: /Start/WhatElse || interval = "30 seconds" 
        
        state: CumulativeFunds
            a: По теме накопительного фонда могу предложить Вам следующие виды документов
            buttons:
                {"text": "Информационный лист Фонд Накопительный", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"} 
                {"text": "Презентация Фонд Накопительный", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Информационный лист_Сбер1 Фонд Накопительный", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"} 
                {"text": "Презентация_Сбер1 Фонд Накопительный", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"} 
            timeout: /Start/WhatElse || interval = "30 seconds" 
    
    # ОТКРЫТЫЕ ФОНДЫ АКЦИЙ
    state: OpenStocksFunds
        a: Какой вид фондов Вас интересует? 
        buttons:
            "Фонд Новые возможности" -> /OpenStocksFunds/NewHopesFund
            "Фонд акций с выплатой дохода" -> /OpenStocksFunds/IncomeStocksFunds
            "Фонд российских акций" -> /OpenStocksFunds/RussianFund
            "Фонд Природные ресурсы" -> /OpenStocksFunds/NaturalSourcesFunds
        timeout: /Start/Timeout || interval = "1 hour"
        
        state: NewHopesFund
            a: По фонду "Новые возможности" могу предложить Вам следующие виды документов
            buttons:
                {"text": "Информационный лист Фонд Новые возможности", "url":  "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация Фонд Новые возможности", "url":  "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Информационный лист_Сбер1 Фонд Новые возможности", "url":  "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация_Сбер1 Фонд Новые возможности", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
            timeout: /Start/WhatElse || interval = "30 seconds" 
        
        state: IncomeStocksFunds
            a: По фонду "Акции с выплатой дохода" могу предложить Вам следующие виды документов
            buttons:
                {"text": "Информационный лист Фонд акций с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация Фонд акций с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Информационный лист_Сбер1 Фонд акций с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация_Сбер1 Фонд акций с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: RussianFund
            a: По фонду российских акций могу предложить Вам следующие виды документов
            buttons:
                {"text": "Информационный лист Фонд российских акций", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация Фонд российских акций", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Информационный лист_Сбер1 Фонд российских акций", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация_Сбер1 Фонд российских акций", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: NaturalSourcesFunds
            a: По фонду природных ресурсов могу предложить Вам следующие виды документов
            buttons:
                {"text": "Информационный лист Фонд Природные ресурсы", "url":  "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация Фонд Природные ресурсы", "url":  "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Информационный лист_Сбер1 Фонд Природные ресурсы", "url":  "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация_Сбер1 Фонд Природные ресурсы", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
            timeout: /Start/WhatElse || interval = "30 seconds"
    
    #ОТКРЫТЫЕ ФОНДЫ СМЕШАННЫХ ИНВЕСТИЦИЙ
    state: MixedInvestmentsFunds
        a: Какой вид фондов Вас интересует? 
        buttons:
            "Фонд смешанный с выплатой дохода" -> /MixedInvestmentsFunds/MixedInvestmentsIncome
            "Фонд взвешенный с выплатой дохода" -> /MixedInvestmentsFunds/WeightedSectorFund
            "Фонд Локальный" -> /MixedInvestmentsFunds/LocalFund
            "Фонд Сбалансированный" -> /MixedInvestmentsFunds/BalancedFund
        timeout: /Start/Timeout || interval = "1 hour"
        
        state: MixedInvestmentsIncome
            a: По cмешанному фонду с выплатой доходов могу предложить Вам следующие виды документов
            buttons:
                {"text": "Информационный лист Фонд смешанный с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация Фонд смешанный с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Информационный лист_Сбер1 Фонд смешанный с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация_Сбер1 Фонд смешанный с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: WeightedSectorFund
            a: По взвешенному фонду с выплатой доходов могу предложить Вам следующие виды документов
            buttons:
                {"text": "Информационный лист Фонд взвешенный с выплатой дохода", "url":  "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация Фонд взвешенный с выплатой дохода", "url":  "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Информационный лист_Сбер1 Фонд взвешенный с выплатой дохода", "url":  "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация_Сбер1 Фонд взвешенный с выплатой дохода", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: LocalFund
            a: По локальному фонду могу предложить Вам следующие виды документов
            buttons:
                {"text": "Информационный лист Фонд Локальный", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация Фонд Локальный", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Информационный лист_Сбер1 Фонд Локальный", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация_Сбер1 Фонд Локальный", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: BalancedFund
            a: По фонду "Сбалансированный" могу предложить Вам следующие виды документов
            buttons:
                {"text": "Информационный лист Фонд Сбалансированный", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация Фонд Сбалансированный", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Информационный лист_Сбер1 Фонд Сбалансированный", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация_Сбер1 Фонд Сбалансированный", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
            timeout: /Start/WhatElse || interval = "30 seconds"
   
    #ЗАКРЫТЫЕ ФОНДЫ
    state: ClosedFunds
        a: Какой вид фондов Вас интересует? 
        buttons:
            "Фонд Современный Арендный бизнес 2" -> /ClosedFunds/RentBusiness2
            "Фонд Современный 6" -> /ClosedFunds/Modern6
        timeout: /Start/Timeout || interval = "1 hour"
    
        state: RentBusiness2
            a: По фонду "Cовременный Арендный бизнес 2" могу предложить Вам следующие виды документов
            buttons:
                {"text": "Информационный лист Фонд Современный Арендный бизнес 2", "url":  "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация Фонд Современный Арендный бизнес 2", "url":  "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Информационный лист_Сбер1 Фонд Современный Арендный бизнес 2", "url":  "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация_Сбер1 Фонд Современный Арендный бизнес 2", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: Modern6
            a: По фонду "Современный 6" могу предложить Вам следующие виды документов
            buttons:
                {"text": "Информационный лист Фонд Современный 6", "url":  "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация Фонд Современный 6", "url":  "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Информационный лист_Сбер1 Фонд Современный 6", "url":  "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
                {"text": "Презентация_Сбер1 Фонд Современный 6", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987"}
            timeout: /Start/WhatElse || interval = "30 seconds"
    
    
    # БИРЖЕВЫЕ ФОНДЫ
    state: ExchangeTradedFunds
        a: Выберите категорию среди биржевых фондов
        buttons:
            "Биржевые фонды акций" -> /StockStonksFunds
            "Биржевые фонды облигаций" -> /StockBondsFunds
            "Биржевые фонды денежного рынка" -> /OpenMoneyFunds
            "Биржевые фонды товарных рынков" -> /SBGDFund
            "Биржевые смарт-фонды" -> /SmartFund5
        timeout: /Start/Timeout || interval = "1 hour"
        
    # БИРЖЕВЫЕ ФОНДЫ АКЦИЙ
    state: StockStonksFunds
        a: Какой фонд в категории "Биржевые фонды акций" Вас интересует?
        buttons:
            "Фонд Индекс МосБиржи IPO - SIPO" -> /OpenStocksFunds/IPO-SIPOFund
            "Фонд Акции средней и малой капитализации - SBSC" -> /OpenStocksFunds/SBSCFund
            "Фонд Топ Российских акций - SBMX" -> /OpenStocksFunds/SMBXFund
            "Фонд Ответственные инвестиции - SBRI" -> /OpenStocksFunds/SBRIFund
            "Фонд Халяльные инвестиции - SBHI" -> /OpenStocksFunds/SBHIFunds
        timeout: /Start/Timeout || interval = "1 hour"
        
        state: IPO-SIPOFund
            a: По фонду Индекса МосБиржи IPO - SIPO могу предложить Вам следующие виды документов
            buttons: 
                {"text": "Информационный лист Фонд Индекс МосБиржи IPO - SIPO", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация Фонд Индекс МосБиржи IPO - SIPO", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Фонд Индекс МосБиржи IPO - SIPO", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация_Сбер1 Фонд Индекс МосБиржи IPO - SIPO", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: SBSCFund
            a: По фонду акций средней и малой капитализации - SBSC могу предложить Вам следующие виды документов
            buttons: 
                {"text": "Информационный лист Фонд Акции средней и малой капитализации - SBSC", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация Фонд Акции средней и малой капитализации - SBSC", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Фонд Акции средней и малой капитализации - SBSC", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация_Сбер1 Фонд Акции средней и малой капитализации - SBSC", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: SMBXFund
            a: По фонду Топ Российских акций - SBMX могу предложить Вам следующие виды документов
            buttons: 
                {"text": "Информационный лист Фонд Топ Российских акций - SBMX", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация Фонд Топ Российских акций - SBMX", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Фонд Топ Российских акций - SBMX", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация_Сбер1 Фонд Топ Российских акций - SBMXC", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: SBRIFund
            a: По фонду отчественных инвестиций SBRI могу предложить Вам следующие виды документов
            buttons: 
                {"text": "Информационный лист Фонд Ответственные инвестиции - SBRI", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация Фонд Ответственные инвестиции - SBRI", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Фонд Ответственные инвестиции - SBRI", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация_Сбер1 Фонд Ответственные инвестиции - SBRI", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: SBHIFund
            a: По фонду халяльных инвестиций могу предложить Вам следующие виды документов
            buttons: 
                {"text": "Информационный лист Фонд Халяльные инвестиции - SBHI", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация Фонд Халяльные инвестиции - SBHI", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Фонд Халяльные инвестиции - SBHI", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация_Сбер1 Фонд Халяльные инвестиции - SBHI", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
    #БИРЖЕВЫЕ ФОНДЫ ОБЛИГАЦИЙ
    state: StockBondsFunds
        a: Какой фонд в категории "Биржевые фонды облигаций" Вас интересует?
        buttons:
            "Фонд Инструменты в юанях - SBBY (ранее - Фонд Облигации в юанях)" -> /OpenBondsFunds/SBBYFund
            "Фонд Долгосрочные гособлигации - SBLB" -> /OpenBondsFunds/SBLBFund
            "Фонд Корпоративные облигации - SBRB" -> /OpenBondsFunds/SBRBFund
            "Фонд Государственные облигации - SBGB" -> /OpenBondsFunds/SBGBFund
            "Фонд Валютных Облигаций - SBCB (ранее - Фонд Российские еврооблигации)" -> /OpenBondsFunds/SBCBFund
            "Фонд Облигации с переменным купоном - SBFR" -> /OpenBondsFunds/SBFRFund
        timeout: /Start/Timeout || interval = "1 hour"
        
        state: SBBYFund
            a: Насчет фонда "Инструменты в юанях - SBBY" могу предложить Вам следующие виды документов
            buttons: 
                {"text": "Информационный лист Фонд Инструменты в юанях - SBBY (ранее - Фонд Облигации в юанях)", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация Фонд Инструменты в юанях - SBBY (ранее - Фонд Облигации в юанях)", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Фонд Инструменты в юанях - SBBY (ранее - Фонд Облигации в юанях)", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация_Сбер1 Фонд Инструменты в юанях - SBBY (ранее - Фонд Облигации в юанях)", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: SBLBFund
            a: По фонду "Долгосрочные гособлигации - SBLB" могу предложить Вам следующие виды документов
            buttons: 
                {"text": "Информационный лист Фонд Долгосрочные гособлигации - SBLB", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация Фонд Долгосрочные гособлигации - SBLB", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Фонд Долгосрочные гособлигации - SBLB", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация_Сбер1 Фонд Долгосрочные гособлигации - SBLB", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: SBRBFund
            a: По фонду "Корпоративные облигации - SBRB" могу предложить Вам следующие виды документов
            buttons: 
                {"text": "Информационный лист Фонд Корпоративные облигации - SBRB", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация Фонд Долгосрочные гособлигации - SBLB", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Фонд Долгосрочные гособлигации - SBLB", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация_Сбер1 Фонд Долгосрочные гособлигации - SBLB", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: SBGBFund
            a: По фонду "Государственные облигации - SBGB" могу предложить Вам следующие виды документов
            buttons: 
                {"text": "Информационный лист Фонд Государственные облигации - SBGB", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация Фонд Государственные облигации - SBGB", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Фонд Государственные облигации - SBGB", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация_Сбер1 Фонд Государственные облигации - SBGB", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: SBCBFund
            a: По фонду "Валютных Облигаций - SBCB" могу предложить Вам следующие виды документов
            buttons: 
                {"text": "Информационный лист Фонд Валютных Облигаций - SBCB (ранее - Фонд Российские еврооблигации)", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация Фонд Валютных Облигаций - SBCB (ранее - Фонд Российские еврооблигации)", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Фонд Валютных Облигаций - SBCB (ранее - Фонд Российские еврооблигации)", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация_Сбер1 Фонд Валютных Облигаций - SBCB (ранее - Фонд Российские еврооблигации)", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: SBFRFund
            a: По фонду "Облигации с переменным купоном - SBFR" могу предложить Вам следующие виды документов
            buttons: 
                {"text": "Информационный лист Фонд Облигации с переменным купоном - SBFR", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация Фонд Облигации с переменным купоном - SBFR", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Фонд Облигации с переменным купоном - SBFR", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация_Сбер1 Фонд Облигации с переменным купоном - SBFR)", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
    #БИРЖЕВЫЕ ФОНДЫ ДЕНЕЖНЫХ РЫНКОВ
    state: OpenMoneyFunds
        a: Какой вид биржевых фондов денежных рынков Вас интересует? 
        buttons:
            "Фонд Сберегательный - SBMM" -> /OpenMoneyFunds/SBMMFund
            "Фонд Сберегательный в юанях - SBCN" -> /OpenMoneyFunds/SBCNFund
        timeout: /Start/Timeout || interval = "1 hour"
        
        state: SBMMFund
            a: По поводу фонда "Сберегательный - SBMM" могу предсотавить следующие документы
            buttons:
                {"text": "Информационный лист Фонд Сберегательный - SBMM", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация Фонд Сберегательный - SBMM", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Фонд Сберегательный - SBMM", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация_Сбер1 Фонд Сберегательный - SBMM", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: SBCNFund
            a: По поводу фонда cберегательный в юанях могу предсотавить следующие документы
            buttons:
                {"text": "Информационный лист Фонд Сберегательный в юанях - SBCN", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация Фонд Сберегательный в юанях - SBCN", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Фонд Сберегательный в юанях - SBCN", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация_Сбер1 Фонд Сберегательный в юанях - SBCN", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            timeout: /Start/WhatElse || interval = "30 seconds"
    
    #БИРЖЕВЫЕ ФОНДЫ ТОВАРНЫХ РЫНКОВ
    state: SBGDFund
        a: Среди биржевых фондов товарных рынков имеется фонд "Доступное золото - SBGD". Для него могу предложить следующие документы
        buttons:
            {"text": "Информационный лист Фонд Доступное золото - SBGD", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            {"text": "Презентация Фонд Доступное золото - SBGD", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            {"text": "Информационный лист_Сбер1 Фонд Доступное золото - SBGD", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            {"text": "Презентация_Сбер1 Фонд Доступное золото - SBGD", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
        timeout: /Start/WhatElse || interval = "30 seconds"
    
    #БИРЖЕВЫЕ СМАРТ-ФОНДЫ
    state: SmartFund5
        a: Для биржевых смарт-фондов могу предложить следующие документы
        buttons:
            {"text": "Информационный лист Биржевые смарт фонды", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            {"text": "Презентация Биржевые смарт фонды", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            {"text": "Информационный лист_Сбер1 Биржевые смарт фонды", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            {"text": "Презентация_Сбер1 Биржевые смарт фонды", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
        timeout: /Start/WhatElse || interval = "30 seconds"
    
    #ИНДИВИДУАЛЬНЫЙ ИНВЕСТИЦИОННЫЙ СЧЕТ (ИИС) 
    state: IIS 
        a: По теме индивидуального инвестиционного счета (ИИС) могу предложить следующие документы по группе пятилетних стратегий
        buttons:
            {"text": "Информационный лист Группа 5-ти летних стратегий ИИС", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            {"text": "Презентация Группа 5-ти летних стратегий ИИС", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            {"text": "Информационный лист_Сбер1 Группа 5-ти летних стратегий ИИС", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            {"text": "Презентация_Сбер1 Группа 5-ти летних стратегий ИИС", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
        timeout: /Start/WhatElse || interval = "30 seconds"
    
    #ДОВЕРИТЕЛЬНОЕ УПРАВЛЕНИЕ 
    state: RubleStrategies
        a: Могу предложить Вам следующие виды стратегий по доверительному управлению
        buttons:
            "Халяльные инвестиции" -> /RubleStrategies/HalalInvestments
            "Модельные портфели 5" -> /RubleStrategies/ModelPortfolio5
            "Дивидендные акции" -> /RubleStrategies/Dividends
        timeout: /Start/Timeout || interval = "1 hour"
        
        state: HalalInvestments 
            a: По теме халяльных инвестиций могу предложить следующие документы
            buttons:
                {"text": "Информационный лист Халяльные инвестиции", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация Халяльные инвестиции", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Халяльные инвестиции", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация_Сбер1 Халяльные инвестиции", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: ModelPortfolio5 
            a: По теме модельного портфеля 5 могу предложить следующие документы
            buttons:
                {"text": "Информационный лист Модельные портфели 5", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация Модельные портфели 5", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Модельные портфели 5", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация_Сбер1 Модельные портфели 5", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            timeout: /Start/WhatElse || interval = "30 seconds"
        
        state: Dividends 
            a: По теме дивидендных акций могу предложить следующие документы
            buttons:
                {"text": "Информационный лист Дивидендные акции", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация Дивидендные акции", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Информационный лист_Сбер1 Дивидендные акции5", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
                {"text": "Презентация_Сбер1 Дивидендные акции", "url": "https://first-am.ru/?ysclid=m35k4y6ov0984914987", "force_reply": "true"}
            timeout: /Start/WhatElse || interval = "30 seconds"

    #ДОКУМЕНТЫ ДЛЯ СТАРТА ИНВЕСТИРОВАНИЯ
    state: Documents1
        a: Доступна регистрация через Госуслуги, СберID, либо прийти с паспортом в УКП (вариант от заказчика)
        timeout: /Documents2 || interval = "2 seconds"
    
    state: Documents2
        a: Для того чтобы начать инвестировать необходимо зарегистрироваться на сайте Госуслуг или СберID или прийти с паспортом в УКП (альтернативный вариант)
        timeout: /Start/WhatElse || interval = "2 seconds"