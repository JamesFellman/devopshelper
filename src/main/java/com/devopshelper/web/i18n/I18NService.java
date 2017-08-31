package com.devopshelper.web.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * Created by James Fellman on 08/31/2017
  */
@Service
public class I18NService {

    @Autowired
    private MessageSource messageSource;

    /**
     * Returns a message for the given message id and the default locale in the session context
     * @param messageId the key to the messages resource file
     **/
    public String getMessage(String messageId) {
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(messageId, locale);
    }

    /**
     * Returns a message for the given message if and locale
     * @param messageId The key to the messages resource file
     * @param locale The Locale
     */
    public String getMessage(String messageId, Locale locale){
        return messageSource.getMessage(messageId, null, locale);
    }


}
