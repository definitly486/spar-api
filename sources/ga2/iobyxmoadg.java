package ga2;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ma0.eablkybsjg;
import ru.myspar.user.models.User;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {
    public static final ha2.ppxfxbqfkf iobyxmoadg(User user) {
        zdlpuopuiu.btonecajqb(user, "<this>");
        List testerFunctions = user.getTesterFunctions();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(testerFunctions, 10));
        Iterator it = testerFunctions.iterator();
        while (it.hasNext()) {
            arrayList.add(((eablkybsjg) it.next()).lqeggnwhkg());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() != 0) {
                arrayList2.add(obj);
            }
        }
        String xmlId = user.getXmlId();
        String phone = user.getPhone();
        String email = user.getEmail();
        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        String number = user.getUserCard().getNumber();
        String gender = user.getGender();
        String dateBirth = user.getDateBirth();
        double bonuses = user.getUserCard().getBonuses();
        String desc = user.getUserCard().getDesc();
        boolean emailEnabled = user.getNotifications().getEmailEnabled();
        boolean smsEnabled = user.getNotifications().getSmsEnabled();
        boolean pushEnabled = user.getNotifications().getPushEnabled();
        boolean isIqosAgreementsApplied = user.getIsIqosAgreementsApplied();
        boolean scanGoAccessGranted = user.getScanGoAccessGranted();
        boolean isEmailConfirmed = user.getIsEmailConfirmed();
        boolean digitalChecks = user.getDigitalChecks();
        int notificationsNew = user.getNotificationsNew();
        int discountsNew = user.getDiscountsNew();
        int promoNew = user.getPromoNew();
        return new ha2.ppxfxbqfkf(phone, xmlId, email, firstName, lastName, number, gender, dateBirth, Double.valueOf(bonuses), desc, emailEnabled, smsEnabled, pushEnabled, isIqosAgreementsApplied, scanGoAccessGranted, isEmailConfirmed, digitalChecks, notificationsNew, discountsNew, arrayList2, user.getVerifySum(), user.getSegments(), user.getGameToken(), promoNew);
    }
}
