package gw1;

import aw1.AuthSignupResponse;
import aw1.AuthTokenResponse;
import bw1.UserChangeFavoriteRequest;
import bw1.UserEditPersonalDataRequest;
import bw1.UserNotificationsSettingsRequest;
import bw1.UserRegistrationRequest;
import bw1.UserSettingsRequest;
import bw1.UserSubscriptionsSettingsRequest;
import bw1.UserUploadDeviceInfoRequest;
import bw1.UserUploadPushTokenRequest;
import com.auth0.android.jwt.JWT;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import cw1.UserGetNewsResponse;
import cw1.UserNotificationSettingResponse;
import cw1.UserPersonalDataResponse;
import cw1.UserSettingsResponse;
import cw1.UserSharePromoDto;
import cw1.UserSubscriptionsSettingResponse;
import dw1.TokenInfoEntity;
import dw1.UserNewsEntity;
import dw1.ppxfxbqfkf;
import gg.kcexrzcfyt;
import hg.jyumaefscl;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lr0.zoijcleaow;
import nw1.btonecajqb;
import nw1.dxjokdxxww;
import nw1.eablkybsjg;
import nw1.gxszxtbevo;
import nw1.lqeggnwhkg;
import nw1.nufgyqmvbu;
import nw1.wkgbmnqykc;
import ru.myspar.proloyalty.user.domain.model.TokenInfo;
import ru.myspar.proloyalty.user.domain.model.UserInfo;
import ru.myspar.proloyalty.user.domain.model.UserNews;
import ru.myspar.proloyalty.user.domain.model.UserSharePromo;
import ru.myspar.proloyalty.user.domain.model.UserSubscriptionSetting;
import zv1.AuthVerifyRequest;
import zv1.AuthVerifyRequestDevice;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final DateTimeFormatter f38643iobyxmoadg = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final DateTimeFormatter f38644zoijcleaow = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneOffset.UTC);

    /* JADX INFO: renamed from: gw1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C0889iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f38645iobyxmoadg;

        static {
            int[] iArr = new int[eablkybsjg.values().length];
            try {
                iArr[eablkybsjg.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eablkybsjg.E_MAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eablkybsjg.SMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38645iobyxmoadg = iArr;
        }
    }

    public static final UserChangeFavoriteRequest agtfadlqog(UserChangeFavoriteRequest.Companion companion, String productId, boolean z13) {
        zdlpuopuiu.btonecajqb(companion, "<this>");
        zdlpuopuiu.btonecajqb(productId, "productId");
        return new UserChangeFavoriteRequest(productId, iobyxmoadg(z13));
    }

    public static final ppxfxbqfkf btonecajqb(ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        return ppxfxbqfkfVar.iobyxmoadg((16383 & 1) != 0 ? ppxfxbqfkfVar.f29730iobyxmoadg : null, (16383 & 2) != 0 ? ppxfxbqfkfVar.f29737zoijcleaow : null, (16383 & 4) != 0 ? ppxfxbqfkfVar.f29734ppxfxbqfkf : null, (16383 & 8) != 0 ? ppxfxbqfkfVar.f29736wkgbmnqykc : null, (16383 & 16) != 0 ? ppxfxbqfkfVar.f29727eablkybsjg : null, (16383 & 32) != 0 ? ppxfxbqfkfVar.f29729gxszxtbevo : false, (16383 & 64) != 0 ? ppxfxbqfkfVar.f29731lqeggnwhkg : false, (16383 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? ppxfxbqfkfVar.f29732nufgyqmvbu : false, (16383 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? ppxfxbqfkfVar.f29726dxjokdxxww : null, (16383 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? ppxfxbqfkfVar.f29724btonecajqb : null, (16383 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? ppxfxbqfkfVar.f29728gtknphoqwx : false, (16383 & 2048) != 0 ? ppxfxbqfkfVar.f29725draadjrbmk : null, (16383 & 4096) != 0 ? ppxfxbqfkfVar.f29735wflxmlrfwp : null, (16383 & 8192) != 0 ? ppxfxbqfkfVar.f29723agtfadlqog : null, (16383 & 16384) != 0 ? ppxfxbqfkfVar.f29733ojitshcjhn : z13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final UserSettingsRequest cdpycssgdh(wkgbmnqykc wkgbmnqykcVar) {
        zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        return new UserSettingsRequest(jyumaefscl.eablkybsjg(new UserNotificationsSettingsRequest(gxszxtbevo(wkgbmnqykcVar.iobyxmoadg()), ppxfxbqfkf(wkgbmnqykcVar.zoijcleaow()))), (List) null, 2, (gtknphoqwx) (0 == true ? 1 : 0));
    }

    public static final UserNews cqumvgiudr(UserGetNewsResponse userGetNewsResponse) {
        zdlpuopuiu.btonecajqb(userGetNewsResponse, "<this>");
        Integer discounts = userGetNewsResponse.getDiscounts();
        int iIntValue = discounts != null ? discounts.intValue() : 0;
        Integer notifications = userGetNewsResponse.getNotifications();
        int iIntValue2 = notifications != null ? notifications.intValue() : 0;
        Integer chatSupportMessages = userGetNewsResponse.getChatSupportMessages();
        int iIntValue3 = chatSupportMessages != null ? chatSupportMessages.intValue() : 0;
        Boolean hasActiveDiscount = userGetNewsResponse.getHasActiveDiscount();
        return new UserNews(iIntValue, iIntValue2, iIntValue3, hasActiveDiscount != null ? hasActiveDiscount.booleanValue() : false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final UserSettingsRequest draadjrbmk(UserSettingsRequest.Companion companion, String id2, boolean z13) {
        zdlpuopuiu.btonecajqb(companion, "<this>");
        zdlpuopuiu.btonecajqb(id2, "id");
        return new UserSettingsRequest((List) null, jyumaefscl.eablkybsjg(new UserSubscriptionsSettingsRequest(id2, ppxfxbqfkf(z13))), 1, (gtknphoqwx) (0 == true ? 1 : 0));
    }

    public static final ppxfxbqfkf dxjokdxxww(ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        return ppxfxbqfkfVar.iobyxmoadg((16383 & 1) != 0 ? ppxfxbqfkfVar.f29730iobyxmoadg : null, (16383 & 2) != 0 ? ppxfxbqfkfVar.f29737zoijcleaow : null, (16383 & 4) != 0 ? ppxfxbqfkfVar.f29734ppxfxbqfkf : null, (16383 & 8) != 0 ? ppxfxbqfkfVar.f29736wkgbmnqykc : null, (16383 & 16) != 0 ? ppxfxbqfkfVar.f29727eablkybsjg : null, (16383 & 32) != 0 ? ppxfxbqfkfVar.f29729gxszxtbevo : false, (16383 & 64) != 0 ? ppxfxbqfkfVar.f29731lqeggnwhkg : false, (16383 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? ppxfxbqfkfVar.f29732nufgyqmvbu : z13, (16383 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? ppxfxbqfkfVar.f29726dxjokdxxww : null, (16383 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? ppxfxbqfkfVar.f29724btonecajqb : null, (16383 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? ppxfxbqfkfVar.f29728gtknphoqwx : false, (16383 & 2048) != 0 ? ppxfxbqfkfVar.f29725draadjrbmk : null, (16383 & 4096) != 0 ? ppxfxbqfkfVar.f29735wflxmlrfwp : null, (16383 & 8192) != 0 ? ppxfxbqfkfVar.f29723agtfadlqog : null, (16383 & 16384) != 0 ? ppxfxbqfkfVar.f29733ojitshcjhn : false);
    }

    private static final String eablkybsjg(LocalDate localDate) {
        String str = localDate != null ? localDate.format(f38643iobyxmoadg) : null;
        return str == null ? "" : str;
    }

    public static final UserNews esjtqupxsv(UserNewsEntity userNewsEntity) {
        zdlpuopuiu.btonecajqb(userNewsEntity, "<this>");
        return new UserNews(userNewsEntity.getDiscounts(), userNewsEntity.getNotifications(), userNewsEntity.getChatSupportMessages(), userNewsEntity.getHasActiveDiscount());
    }

    public static final ppxfxbqfkf gtknphoqwx(ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo data) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        zdlpuopuiu.btonecajqb(data, "data");
        String strGxszxtbevo = data.gxszxtbevo();
        String strEablkybsjg = data.eablkybsjg();
        String str = strEablkybsjg == null ? "" : strEablkybsjg;
        String strPpxfxbqfkf = data.ppxfxbqfkf();
        return ppxfxbqfkfVar.iobyxmoadg((16383 & 1) != 0 ? ppxfxbqfkfVar.f29730iobyxmoadg : null, (16383 & 2) != 0 ? ppxfxbqfkfVar.f29737zoijcleaow : null, (16383 & 4) != 0 ? ppxfxbqfkfVar.f29734ppxfxbqfkf : strPpxfxbqfkf == null ? "" : strPpxfxbqfkf, (16383 & 8) != 0 ? ppxfxbqfkfVar.f29736wkgbmnqykc : strGxszxtbevo, (16383 & 16) != 0 ? ppxfxbqfkfVar.f29727eablkybsjg : str, (16383 & 32) != 0 ? ppxfxbqfkfVar.f29729gxszxtbevo : false, (16383 & 64) != 0 ? ppxfxbqfkfVar.f29731lqeggnwhkg : false, (16383 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? ppxfxbqfkfVar.f29732nufgyqmvbu : false, (16383 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? ppxfxbqfkfVar.f29726dxjokdxxww : data.wkgbmnqykc().wkgbmnqykc(), (16383 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? ppxfxbqfkfVar.f29724btonecajqb : null, (16383 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? ppxfxbqfkfVar.f29728gtknphoqwx : false, (16383 & 2048) != 0 ? ppxfxbqfkfVar.f29725draadjrbmk : null, (16383 & 4096) != 0 ? ppxfxbqfkfVar.f29735wflxmlrfwp : null, (16383 & 8192) != 0 ? ppxfxbqfkfVar.f29723agtfadlqog : null, (16383 & 16384) != 0 ? ppxfxbqfkfVar.f29733ojitshcjhn : false);
    }

    private static final String gxszxtbevo(eablkybsjg eablkybsjgVar) {
        int i13 = C0889iobyxmoadg.f38645iobyxmoadg[eablkybsjgVar.ordinal()];
        if (i13 == 1) {
            return "PUSH";
        }
        if (i13 == 2) {
            return "E_MAIL";
        }
        if (i13 == 3) {
            return "SMS";
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final String iobyxmoadg(boolean z13) {
        return z13 ? "delete" : "add";
    }

    public static final TokenInfoEntity iozdgvuglv(TokenInfo tokenInfo) {
        zdlpuopuiu.btonecajqb(tokenInfo, "<this>");
        return new TokenInfoEntity(tokenInfo.getToken(), tokenInfo.getRefreshToken(), tokenInfo.getTokenEndTime());
    }

    public static final UserRegistrationRequest istkbnxepw(lqeggnwhkg lqeggnwhkgVar, String refreshToken) {
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        zdlpuopuiu.btonecajqb(refreshToken, "refreshToken");
        boolean zLqeggnwhkg = lqeggnwhkgVar.lqeggnwhkg();
        boolean zGxszxtbevo = lqeggnwhkgVar.gxszxtbevo();
        String strPpxfxbqfkf = lqeggnwhkgVar.ppxfxbqfkf();
        String strEablkybsjg = lqeggnwhkgVar.eablkybsjg();
        String strEablkybsjg2 = eablkybsjg(lqeggnwhkgVar.iobyxmoadg());
        String upperCase = lqeggnwhkgVar.wkgbmnqykc().wkgbmnqykc().toUpperCase(Locale.ROOT);
        zdlpuopuiu.dxjokdxxww(upperCase, "toUpperCase(...)");
        return new UserRegistrationRequest(zLqeggnwhkg, zGxszxtbevo, strPpxfxbqfkf, strEablkybsjg, strEablkybsjg2, upperCase, lqeggnwhkgVar.zoijcleaow(), refreshToken);
    }

    public static final UserInfo iwizpuwonk(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        String strBtonecajqb = ppxfxbqfkfVar.btonecajqb();
        String strDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        String strGxszxtbevo = ppxfxbqfkfVar.gxszxtbevo();
        String strLqeggnwhkg = ppxfxbqfkfVar.lqeggnwhkg();
        String strGtknphoqwx = ppxfxbqfkfVar.gtknphoqwx();
        boolean zOjitshcjhn = ppxfxbqfkfVar.ojitshcjhn();
        boolean zRgvfuqvkyq = ppxfxbqfkfVar.rgvfuqvkyq();
        boolean zPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        zoijcleaow zoijcleaowVarIobyxmoadg = zoijcleaow.f63923yggfygwlhe.iobyxmoadg(ppxfxbqfkfVar.dxjokdxxww());
        Object objWkgbmnqykc = wkgbmnqykc(ppxfxbqfkfVar.eablkybsjg());
        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = null;
        }
        return new UserInfo(strBtonecajqb, strDraadjrbmk, strGxszxtbevo, strLqeggnwhkg, strGtknphoqwx, zOjitshcjhn, zRgvfuqvkyq, zPpxfxbqfkf, zoijcleaowVarIobyxmoadg, (LocalDate) objWkgbmnqykc, ppxfxbqfkfVar.wflxmlrfwp(), ppxfxbqfkfVar.nufgyqmvbu(), ppxfxbqfkfVar.agtfadlqog(), ppxfxbqfkfVar.wkgbmnqykc(), ppxfxbqfkfVar.vdvldrhtss());
    }

    public static final TokenInfo jyumaefscl(TokenInfoEntity tokenInfoEntity) {
        zdlpuopuiu.btonecajqb(tokenInfoEntity, "<this>");
        String token = tokenInfoEntity.getToken();
        String refreshToken = tokenInfoEntity.getRefreshToken();
        LocalDateTime tokenEndTime = tokenInfoEntity.getTokenEndTime();
        if (tokenEndTime == null) {
            tokenEndTime = LocalDateTime.now();
        }
        zdlpuopuiu.lqeggnwhkg(tokenEndTime);
        return new TokenInfo(token, refreshToken, tokenEndTime);
    }

    public static final nufgyqmvbu kcexrzcfyt(UserSettingsResponse userSettingsResponse) {
        List listWflxmlrfwp;
        zdlpuopuiu.btonecajqb(userSettingsResponse, "<this>");
        List notifications = userSettingsResponse.getNotifications();
        ArrayList arrayList = new ArrayList();
        Iterator it = notifications.iterator();
        while (it.hasNext()) {
            wkgbmnqykc wkgbmnqykcVarVdvldrhtss = vdvldrhtss((UserNotificationSettingResponse) it.next());
            if (wkgbmnqykcVarVdvldrhtss != null) {
                arrayList.add(wkgbmnqykcVarVdvldrhtss);
            }
        }
        List subscriptions = userSettingsResponse.getSubscriptions();
        if (subscriptions != null) {
            listWflxmlrfwp = new ArrayList();
            Iterator it2 = subscriptions.iterator();
            while (it2.hasNext()) {
                UserSubscriptionSetting userSubscriptionSettingPmvmpeiblj = pmvmpeiblj((UserSubscriptionsSettingResponse) it2.next());
                if (userSubscriptionSettingPmvmpeiblj != null) {
                    listWflxmlrfwp.add(userSubscriptionSettingPmvmpeiblj);
                }
            }
        } else {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        return new nufgyqmvbu(arrayList, listWflxmlrfwp);
    }

    public static final UserSharePromo lereixgezr(UserSharePromoDto userSharePromoDto) {
        zdlpuopuiu.btonecajqb(userSharePromoDto, "<this>");
        return new UserSharePromo(userSharePromoDto.getImage(), userSharePromoDto.getDescription(), userSharePromoDto.getPromocode(), userSharePromoDto.getShareMsg(), userSharePromoDto.getIsPromoAvailable());
    }

    public static final ppxfxbqfkf lmojexxdyd(UserInfo userInfo) {
        zdlpuopuiu.btonecajqb(userInfo, "<this>");
        String id2 = userInfo.getId();
        String phone = userInfo.getPhone();
        String email = userInfo.getEmail();
        String firstName = userInfo.getFirstName();
        String lastName = userInfo.getLastName();
        boolean isActive = userInfo.getIsActive();
        boolean isCardBlocked = userInfo.getIsCardBlocked();
        boolean agreementAccepted = userInfo.getAgreementAccepted();
        String strWkgbmnqykc = userInfo.getGender().wkgbmnqykc();
        String strEablkybsjg = eablkybsjg(userInfo.getDateBirth());
        String gameToken = userInfo.getGameToken();
        return new ppxfxbqfkf(id2, phone, email, firstName, lastName, isActive, isCardBlocked, agreementAccepted, strWkgbmnqykc, strEablkybsjg, userInfo.getScangoAccess(), userInfo.getWebviewToken(), gameToken, userInfo.getCardNumber(), userInfo.getIsEReceiptAccepted());
    }

    public static final UserInfo lqeggnwhkg(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        JWT jwt = new JWT(str);
        String strIobyxmoadg = jwt.eablkybsjg("externalId").iobyxmoadg();
        String str2 = strIobyxmoadg == null ? "" : strIobyxmoadg;
        String strIobyxmoadg2 = jwt.eablkybsjg("identifier").iobyxmoadg();
        String str3 = strIobyxmoadg2 == null ? "" : strIobyxmoadg2;
        String strIobyxmoadg3 = jwt.eablkybsjg(Scopes.EMAIL).iobyxmoadg();
        String str4 = strIobyxmoadg3 == null ? "" : strIobyxmoadg3;
        String strIobyxmoadg4 = jwt.eablkybsjg("firstName").iobyxmoadg();
        String str5 = strIobyxmoadg4 == null ? "" : strIobyxmoadg4;
        String strIobyxmoadg5 = jwt.eablkybsjg("lastName").iobyxmoadg();
        String str6 = strIobyxmoadg5 == null ? "" : strIobyxmoadg5;
        Boolean boolZoijcleaow = jwt.eablkybsjg("isActive").zoijcleaow();
        boolean zBooleanValue = boolZoijcleaow != null ? boolZoijcleaow.booleanValue() : false;
        Boolean boolZoijcleaow2 = jwt.eablkybsjg("isCardBlocked").zoijcleaow();
        boolean zBooleanValue2 = boolZoijcleaow2 != null ? boolZoijcleaow2.booleanValue() : true;
        Boolean boolZoijcleaow3 = jwt.eablkybsjg("isAgreementAccepted").zoijcleaow();
        boolean zBooleanValue3 = boolZoijcleaow3 != null ? boolZoijcleaow3.booleanValue() : false;
        zoijcleaow.iobyxmoadg iobyxmoadgVar = zoijcleaow.f63923yggfygwlhe;
        String strIobyxmoadg6 = jwt.eablkybsjg("sex").iobyxmoadg();
        if (strIobyxmoadg6 == null) {
            strIobyxmoadg6 = "";
        }
        zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg(strIobyxmoadg6);
        String strIobyxmoadg7 = jwt.eablkybsjg("dateOfBirth").iobyxmoadg();
        if (strIobyxmoadg7 == null) {
            strIobyxmoadg7 = "";
        }
        Object objWkgbmnqykc = wkgbmnqykc(strIobyxmoadg7);
        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = null;
        }
        LocalDate localDate = (LocalDate) objWkgbmnqykc;
        String strIobyxmoadg8 = jwt.eablkybsjg("gameToken").iobyxmoadg();
        String str7 = strIobyxmoadg8 == null ? "" : strIobyxmoadg8;
        String strIobyxmoadg9 = jwt.eablkybsjg("webviewToken").iobyxmoadg();
        String str8 = strIobyxmoadg9 == null ? "" : strIobyxmoadg9;
        String strIobyxmoadg10 = jwt.eablkybsjg("cardNumber").iobyxmoadg();
        String str9 = strIobyxmoadg10 == null ? "" : strIobyxmoadg10;
        Boolean boolZoijcleaow4 = jwt.eablkybsjg("isEReceiptAccepted").zoijcleaow();
        return new UserInfo(str2, str3, str4, str5, str6, zBooleanValue, zBooleanValue2, zBooleanValue3, zoijcleaowVarIobyxmoadg, localDate, false, str7, str8, str9, boolZoijcleaow4 != null ? boolZoijcleaow4.booleanValue() : false);
    }

    private static final eablkybsjg nufgyqmvbu(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 82233) {
            if (iHashCode != 2467610) {
                if (iHashCode == 2065504625 && str.equals("E_MAIL")) {
                    return eablkybsjg.E_MAIL;
                }
            } else if (str.equals("PUSH")) {
                return eablkybsjg.PUSH;
            }
        } else if (str.equals("SMS")) {
            return eablkybsjg.SMS;
        }
        return null;
    }

    public static final String ojitshcjhn(uw0.ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        return zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar.lmojexxdyd(), "google") ? "ANDROID" : "HUAWEI";
    }

    public static final gxszxtbevo oxmwwwfdhm(UserPersonalDataResponse userPersonalDataResponse) {
        zdlpuopuiu.btonecajqb(userPersonalDataResponse, "<this>");
        return new gxszxtbevo(userPersonalDataResponse.getPhoneNumber(), userPersonalDataResponse.getFirstName(), userPersonalDataResponse.getLastName(), userPersonalDataResponse.getDateOfBirth(), zoijcleaow.f63923yggfygwlhe.iobyxmoadg(userPersonalDataResponse.getSex()), userPersonalDataResponse.getEmail(), userPersonalDataResponse.getIsEmailConfirmed(), userPersonalDataResponse.getIsEReceiptAccepted(), userPersonalDataResponse.getCardNumber(), userPersonalDataResponse.getCardType());
    }

    private static final UserSubscriptionSetting pmvmpeiblj(UserSubscriptionsSettingResponse userSubscriptionsSettingResponse) {
        String id2 = userSubscriptionsSettingResponse.getId();
        Boolean boolZoijcleaow = zoijcleaow(userSubscriptionsSettingResponse.getStatus());
        if (boolZoijcleaow != null) {
            return new UserSubscriptionSetting(id2, boolZoijcleaow.booleanValue(), userSubscriptionsSettingResponse.getName());
        }
        return null;
    }

    private static final String ppxfxbqfkf(boolean z13) {
        return z13 ? "ACTIVE" : "INACTIVE";
    }

    public static final String rgvfuqvkyq(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        return "Bearer " + str;
    }

    private static final wkgbmnqykc vdvldrhtss(UserNotificationSettingResponse userNotificationSettingResponse) {
        Boolean boolZoijcleaow;
        String id2 = userNotificationSettingResponse.getId();
        eablkybsjg eablkybsjgVarNufgyqmvbu = nufgyqmvbu(userNotificationSettingResponse.getChannel());
        if (eablkybsjgVarNufgyqmvbu == null || (boolZoijcleaow = zoijcleaow(userNotificationSettingResponse.getStatus())) == null) {
            return null;
        }
        return new wkgbmnqykc(id2, eablkybsjgVarNufgyqmvbu, boolZoijcleaow.booleanValue());
    }

    public static final UserUploadDeviceInfoRequest wflxmlrfwp(UserUploadDeviceInfoRequest.Companion companion, String id2, String pushToken, String platform) {
        zdlpuopuiu.btonecajqb(companion, "<this>");
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(pushToken, "pushToken");
        zdlpuopuiu.btonecajqb(platform, "platform");
        return new UserUploadDeviceInfoRequest(new UserUploadPushTokenRequest(id2, pushToken, platform));
    }

    private static final Object wkgbmnqykc(String str) {
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            return kcexrzcfyt.wkgbmnqykc(LocalDate.parse(str, f38643iobyxmoadg));
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            return kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
    }

    public static final UserNewsEntity wwaezpbzkn(UserNews userNews) {
        zdlpuopuiu.btonecajqb(userNews, "<this>");
        return new UserNewsEntity(userNews.getNotifications(), userNews.getDiscounts(), userNews.getChatSupportMessages(), userNews.getHasActiveDiscount());
    }

    public static final AuthVerifyRequest yadqdtsiqt(btonecajqb btonecajqbVar, String deviceId, String pushToken, String platform) {
        zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        zdlpuopuiu.btonecajqb(deviceId, "deviceId");
        zdlpuopuiu.btonecajqb(pushToken, "pushToken");
        zdlpuopuiu.btonecajqb(platform, "platform");
        return new AuthVerifyRequest(btonecajqbVar.zoijcleaow(), btonecajqbVar.iobyxmoadg(), btonecajqbVar.ppxfxbqfkf(), new AuthVerifyRequestDevice(deviceId, pushToken, platform));
    }

    public static final TokenInfo yggfygwlhe(AuthTokenResponse authTokenResponse) {
        Object objWkgbmnqykc;
        zdlpuopuiu.btonecajqb(authTokenResponse, "<this>");
        String token = authTokenResponse.getTokenInfo().getToken();
        String refreshToken = authTokenResponse.getTokenInfo().getRefreshToken();
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(LocalDateTime.parse(authTokenResponse.getTokenInfo().getTokenLife(), f38644zoijcleaow).atOffset(ZoneOffset.UTC).atZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime());
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        if (kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) != null) {
            objWkgbmnqykc = LocalDateTime.now().plusMinutes(1L);
        }
        zdlpuopuiu.dxjokdxxww(objWkgbmnqykc, "getOrElse(...)");
        return new TokenInfo(token, refreshToken, (LocalDateTime) objWkgbmnqykc);
    }

    public static final dxjokdxxww zdlpuopuiu(AuthSignupResponse authSignupResponse) {
        zdlpuopuiu.btonecajqb(authSignupResponse, "<this>");
        return new dxjokdxxww(authSignupResponse.getRateLimitReset(), authSignupResponse.getHash());
    }

    private static final Boolean zoijcleaow(String str) {
        if (zdlpuopuiu.eablkybsjg(str, "ACTIVE")) {
            return Boolean.TRUE;
        }
        if (zdlpuopuiu.eablkybsjg(str, "INACTIVE")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final UserEditPersonalDataRequest zynmafqrjb(nw1.ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        String strWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc();
        String strPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        String strIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg();
        String upperCase = ppxfxbqfkfVar.zoijcleaow().wkgbmnqykc().toUpperCase(Locale.ROOT);
        zdlpuopuiu.dxjokdxxww(upperCase, "toUpperCase(...)");
        return new UserEditPersonalDataRequest(strWkgbmnqykc, strPpxfxbqfkf, strIobyxmoadg, upperCase);
    }
}
