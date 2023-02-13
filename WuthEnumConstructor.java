
public class WuthEnumConstructor {
    public static void main(String[] args) {
        System.out.println(TransactionPermission.TM_FN_VIEW_ACC.getPermission());
    }

}

enum TransactionPermission{
    TM_FN_CREATE_TRN ("CAN_CREATE_TRANSACTIONS"),
    TM_FN_VIEW_ACC ("CAN_VIEW_ACCOUNTS"),
    TM_FN_EDIT_TRN ("CAN_EDIT_TRANSACTIONS"),
    TM_FN_APPROVE_TRN ("CAN_APPROVE_TRANSACTIONS"),
    TM_FN_VIEW_TRN ("CAN_VIEW_TRANSACTIONS");

    private String permission;

    TransactionPermission(String permissionType) {
        this.permission = permissionType;
    }

    public String getPermission() {
        return permission;
    }
}
