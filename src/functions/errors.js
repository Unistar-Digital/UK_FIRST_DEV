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
    });
    $reactions.transition("/Start/Operator");

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
    })
    $reactions.transition("/Start/Operator")
