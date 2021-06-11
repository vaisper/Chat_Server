package ru.chat.common;

public class Library {
    /*
    /auth_request±login±password
    /auth_accept±nickname
    /auth_error
    /broadcast±msg
    /msg_format_error±msg
    /user_list±u1±u2±u3±u4....
    * */

    public static final int MSG_TYPE_INDEX = 0;
    public static final int AUTH_REQUEST_LENGTH = 3;
    public static final String DELIMITER = "±";
    public static final String AUTH_REQUEST = "/auth_request";
    public static final String AUTH_ACCEPT = "/auth_accept";
    public static final String AUTH_DENIED = "/auth_denied";
    public static final String MSG_FORMAT_ERROR = "/msg_format_error";
    // если мы вдруг не поняли, что за сообщение и не смогли разобрать
    public static final String SERVER_BCAST_MSG = "/bcast";
    // то есть сообщение, которое будет посылаться всем
    public static final String USER_LIST = "/user_list";
    public static final String CLIENT_BCAST_MSG = "/client_broadcast";

    public static String getTypeBcastClient(String msg) {
        return CLIENT_BCAST_MSG + DELIMITER + msg;
    }


    public static String getUserList(String users) {
        return USER_LIST + DELIMITER + users;
    }

    public static String getAuthRequest(String login, String password) {
        return AUTH_REQUEST + DELIMITER + login + DELIMITER + password;
    }

    public static String getAuthAccept(String nickname) {
        return AUTH_ACCEPT + DELIMITER + nickname;
    }

    public static String getAuthDenied() {
        return AUTH_DENIED;
    }

    public static String getMsgFormatError(String message) {
        return MSG_FORMAT_ERROR + DELIMITER + message;
    }

    public static String getTypeBroadcast(String src, String message) {
        return SERVER_BCAST_MSG + DELIMITER + System.currentTimeMillis() +
                DELIMITER + src + DELIMITER + message;
    }


}
