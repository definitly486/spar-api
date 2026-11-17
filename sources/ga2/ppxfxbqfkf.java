package ga2;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ma0.eablkybsjg;
import ma2.UserDto;
import ma2.UserSubscriptionDto;
import ru.myspar.user.models.User;
import ru.myspar.user.models.UserCard;
import ru.myspar.user.models.UserNotifications;
import ru.myspar.user.models.UserSubscription;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {
    public static final User iobyxmoadg(UserDto userDto) {
        zdlpuopuiu.btonecajqb(userDto, "<this>");
        List testerFunctions = userDto.getTesterFunctions();
        if (testerFunctions == null) {
            testerFunctions = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(testerFunctions, 10));
        Iterator it = testerFunctions.iterator();
        while (it.hasNext()) {
            arrayList.add(eablkybsjg.f66657yggfygwlhe.iobyxmoadg((String) it.next()));
        }
        List listMetgxyhuhe = jyumaefscl.metgxyhuhe(arrayList);
        String xmlId = userDto.getXmlId();
        String phone = userDto.getPhone();
        String str = phone == null ? "" : phone;
        String email = userDto.getEmail();
        String str2 = email == null ? "" : email;
        String firstName = userDto.getFirstName();
        String str3 = firstName == null ? "" : firstName;
        String lastName = userDto.getLastName();
        String str4 = lastName == null ? "" : lastName;
        String cardNumber = userDto.getCardNumber();
        if (cardNumber == null) {
            cardNumber = "";
        }
        Double bonuses = userDto.getBonuses();
        double dDoubleValue = bonuses != null ? bonuses.doubleValue() : 0.0d;
        String qrText = userDto.getQrText();
        if (qrText == null) {
            qrText = "";
        }
        UserCard userCard = new UserCard(cardNumber, dDoubleValue, qrText);
        String gender = userDto.getGender();
        String str5 = gender == null ? "" : gender;
        String dateBirth = userDto.getDateBirth();
        String str6 = dateBirth == null ? "" : dateBirth;
        Boolean scanGoAccessGranted = userDto.getScanGoAccessGranted();
        boolean zBooleanValue = scanGoAccessGranted != null ? scanGoAccessGranted.booleanValue() : false;
        Boolean blockEmail = userDto.getBlockEmail();
        boolean z13 = !(blockEmail != null ? blockEmail.booleanValue() : false);
        Boolean blockSms = userDto.getBlockSms();
        boolean z14 = !(blockSms != null ? blockSms.booleanValue() : false);
        Boolean blockPush = userDto.getBlockPush();
        UserNotifications userNotifications = new UserNotifications(z13, z14, !(blockPush != null ? blockPush.booleanValue() : false));
        Boolean agreementAccepted = userDto.getAgreementAccepted();
        boolean zBooleanValue2 = agreementAccepted != null ? agreementAccepted.booleanValue() : false;
        Boolean isEmailConfirmed = userDto.getIsEmailConfirmed();
        boolean zBooleanValue3 = isEmailConfirmed != null ? isEmailConfirmed.booleanValue() : false;
        Boolean digitalCheck = userDto.getDigitalCheck();
        boolean zBooleanValue4 = digitalCheck != null ? digitalCheck.booleanValue() : false;
        Integer notificationsNew = userDto.getNotificationsNew();
        int iIntValue = notificationsNew != null ? notificationsNew.intValue() : 0;
        Integer discountsNew = userDto.getDiscountsNew();
        int iIntValue2 = discountsNew != null ? discountsNew.intValue() : 0;
        Integer promoNew = userDto.getPromoNew();
        int iIntValue3 = promoNew != null ? promoNew.intValue() : 0;
        Double verifySum = userDto.getVerifySum();
        List subscriptions = userDto.getSubscriptions();
        if (subscriptions == null) {
            subscriptions = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(subscriptions, 10));
        Iterator it2 = subscriptions.iterator();
        while (it2.hasNext()) {
            arrayList2.add(zoijcleaow((UserSubscriptionDto) it2.next()));
        }
        List segments = userDto.getSegments();
        if (segments == null) {
            segments = jyumaefscl.wflxmlrfwp();
        }
        List list = segments;
        String gameToken = userDto.getGameToken();
        return new User(xmlId, str, str2, str3, str4, userCard, str5, str6, userNotifications, zBooleanValue2, zBooleanValue, zBooleanValue3, zBooleanValue4, iIntValue, iIntValue2, iIntValue3, listMetgxyhuhe, verifySum, arrayList2, list, gameToken == null ? "" : gameToken);
    }

    public static final UserSubscription zoijcleaow(UserSubscriptionDto userSubscriptionDto) {
        zdlpuopuiu.btonecajqb(userSubscriptionDto, "<this>");
        return new UserSubscription(userSubscriptionDto.getId(), userSubscriptionDto.getName(), userSubscriptionDto.getExpiry(), userSubscriptionDto.getAutoRenewal(), userSubscriptionDto.getIsAutoRenewalEnabled());
    }
}
