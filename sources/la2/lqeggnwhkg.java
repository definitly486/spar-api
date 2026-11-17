package la2;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.user.models.UserNotifications;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lqeggnwhkg {
    public static final UpdateUserNotificationsRequest iobyxmoadg(UserNotifications userNotifications) {
        zdlpuopuiu.btonecajqb(userNotifications, "<this>");
        return new UpdateUserNotificationsRequest(userNotifications.getEmailEnabled(), userNotifications.getSmsEnabled(), userNotifications.getPushEnabled());
    }
}
