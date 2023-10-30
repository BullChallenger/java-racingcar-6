package constant;

public enum Exception {

    DUPLICATED_NAME("중복된 이름을 사용할 수 없습니다."),
    OVER_LIMIT_NAME_LENGTH("5자 이상의 이름은 입력할 수 없습니다."),
    NON_NUMERIC("반복 횟수는 숫자만 입력 가능합니다.");

    private String message;

    Exception(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}