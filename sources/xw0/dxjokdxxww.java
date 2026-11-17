package xw0;

import java.time.LocalDateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww {
    public final LocalDateTime iobyxmoadg(String str) {
        if (str == null) {
            return null;
        }
        return LocalDateTime.parse(str);
    }

    public final String zoijcleaow(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return localDateTime.toString();
        }
        return null;
    }
}
