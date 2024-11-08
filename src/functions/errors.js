init:
    $mail.debug(true); 
    
init: 
    bind("onScriptError", function($context) {
        $session.mistake = "onScriptError"
        $mail.send({
            from: "just-alarm@unistar.ru",
            to: ["a.polyakov@unistar.ru"],
            subject: "OnScriptError. UK_FIRST_DEV",
            content: "Возникла ошибка скрипта на проекте UK_FIRST_DEV",
            smtpHost: "mail.unistar.ru", 
            smtpPort: "465",
            user: "just-alarm@unistar.ru",
            password: "$SMTP_password"})
    });

init:
    bind("onAnyError", function($context) {
        $session.mistake = "onAnyError"
        $mail.send({
            from: "just-alarm@unistar.ru",
            to: ["a.polyakov@unistar.ru"],
            subject: "OnAnyError. UK_FIRST_DEV",
            content: "Возникла ошибка сервера на проекте UK_FIRST_DEV",
            smtpHost: "mail.unistar.ru", 
            smtpPort: "465",
            user: "just-alarm@unistar.ru",
            password: "$SMTP_password"})
    })
