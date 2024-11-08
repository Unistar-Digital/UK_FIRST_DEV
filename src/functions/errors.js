init:
    $mail.debug(true); 
    
init: 
    bind("onScriptError", function($context) {
        $mail.send({
            from: "just-alarm@unistar.ru",
            to: ["a.polyakov@unistar.ru"],
            subject: "OnScriptError. UK_FIRST_DEV",
            content: "Возникла ошибка скрипта на проекте UK_FIRST_DEV",
            smtpHost: "mail.unistar.ru", 
            smtpPort: "465",
            user: "just-alarm@unistar.ru",
            password: "$SMTP_password"})
        $reactions.answer("К сожалению, сейчас я не смогу проконсультировать Вас 😔, но Вы можете обратиться к нашему сотруднику")
        $reactions.answer("Номера телефонов: 8 800 301 1616 (бесплатный звонок по России) и 8 495 258 0534 (для жителей Москвы) 📱")
        $reactions.answer("Электронная почта info@first-am.ru 📩") 
        $reactions.answer("Он поможет Вам с решением данного вопроса😉")
        $jsapi.stopSession()
    });

init:
    bind("onAnyError", function($context) {
        $mail.send({
            from: "just-alarm@unistar.ru",
            to: ["a.polyakov@unistar.ru"],
            subject: "OnAnyError. UK_FIRST_DEV",
            content: "Возникла ошибка сервера на проекте UK_FIRST_DEV",
            smtpHost: "mail.unistar.ru", 
            smtpPort: "465",
            user: "just-alarm@unistar.ru",
            password: "$SMTP_password"})
        $reactions.answer("К сожалению, сейчас я не смогу проконсультировать Вас 😔, но Вы можете обратиться к нашему сотруднику")
        $reactions.answer("Номера телефонов: 8 800 301 1616 (бесплатный звонок по России) и 8 495 258 0534 (для жителей Москвы) 📱")
        $reactions.answer("Электронная почта info@first-am.ru 📩") 
        $reactions.answer("Он поможет Вам с решением данного вопроса😉")
        $jsapi.stopSession()
    })
