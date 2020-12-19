package com.dev.constructs;

public enum XuatXu {
    NhậpKhẩu,
    NộiĐịa,
    LiênDoanh;

    public static String getTypeByInput(String ordinal) {
        for(XuatXu t : XuatXu.values()) {
            if (t.toString() == ordinal) {
                return t.toString();
            }
        }

        return null;
    }
}

