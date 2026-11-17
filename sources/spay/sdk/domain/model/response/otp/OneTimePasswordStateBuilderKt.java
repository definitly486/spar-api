package spay.sdk.domain.model.response.otp;

import kk.b0;
import kk.d1;
import kk.eb;
import kk.eslsurpljm;
import kk.f2;
import kk.g3;
import kk.gc;
import kk.iyctptxqzt;
import kk.jd;
import kk.l4;
import kk.me;
import kk.n5;
import kk.q6;
import kk.t7;
import kk.v8;
import kk.y9;
import kk.zv;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a7\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\f\"\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\f\"\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\f\"\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\f\"\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\f\"\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"", "mobilePhone", "", "errorCode", "errorMessage", "cardNumber", "Lkk/jd;", "creationOneTimePasswordState", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lkk/jd;", "confirmationOneTimePasswordState", "(Ljava/lang/String;ILjava/lang/String;)Lkk/jd;", "SUCCESS_CODE", "I", "OTP_SYSTEM_ERROR_CODE", "VALIDATION_ERROR_CODE", "CREATE_ATTEMPTS_EXHAUSTED_CODE", "TIMEOUT_CODE", "WRONG_BUNDLE_STATE_CODE", "ORDER_NOT_FOUND_CODE", "BUNDLE_NOT_FOUND_CODE", "WRONG_CODE", "ATTEMPTS_EXHAUSTED_CODE", "CODE_LIFETIME_EXPIRED", "SPaySDK_baseRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OneTimePasswordStateBuilderKt {
    private static final int ATTEMPTS_EXHAUSTED_CODE = 6;
    private static final int BUNDLE_NOT_FOUND_CODE = 127;
    private static final int CODE_LIFETIME_EXPIRED = 9;
    private static final int CREATE_ATTEMPTS_EXHAUSTED_CODE = 3;
    private static final int ORDER_NOT_FOUND_CODE = 107;
    public static final int OTP_SYSTEM_ERROR_CODE = 2;
    public static final int SUCCESS_CODE = 0;
    private static final int TIMEOUT_CODE = 4;
    private static final int VALIDATION_ERROR_CODE = 1;
    private static final int WRONG_BUNDLE_STATE_CODE = 8;
    private static final int WRONG_CODE = 5;

    public static final jd confirmationOneTimePasswordState(String mobilePhone, int i13, String str) {
        zdlpuopuiu.btonecajqb(mobilePhone, "mobilePhone");
        if (i13 == 0) {
            return new b0(mobilePhone);
        }
        if (i13 == 1) {
            return new f2(str != null ? me.iobyxmoadg(str, "text", str) : zv.zoijcleaow(R.string.spay_otp_confirm_validation_error));
        }
        if (i13 == 5) {
            return new g3(str != null ? me.iobyxmoadg(str, "text", str) : zv.zoijcleaow(R.string.spay_otp_confirm_wrong_code_error), mobilePhone);
        }
        if (i13 == 6) {
            return new iyctptxqzt(str != null ? me.iobyxmoadg(str, "text", str) : zv.zoijcleaow(R.string.spay_otp_confirm_attempts_exhausted_error), mobilePhone);
        }
        if (i13 != 9) {
            return new d1(str != null ? me.iobyxmoadg(str, "text", str) : zv.zoijcleaow(R.string.spay_otp_confirm_system_or_internal_error));
        }
        return new eslsurpljm(str != null ? me.iobyxmoadg(str, "text", str) : zv.zoijcleaow(R.string.spay_otp_confirm_code_lifetime_expired_error), mobilePhone);
    }

    public static /* synthetic */ jd confirmationOneTimePasswordState$default(String str, int i13, String str2, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            str2 = null;
        }
        return confirmationOneTimePasswordState(str, i13, str2);
    }

    public static final jd creationOneTimePasswordState(String mobilePhone, int i13, String str, String str2) {
        zdlpuopuiu.btonecajqb(mobilePhone, "mobilePhone");
        if (i13 == 0) {
            return new t7(mobilePhone, str2);
        }
        if (i13 == 1) {
            return new eb(str != null ? me.iobyxmoadg(str, "text", str) : zv.zoijcleaow(R.string.spay_create_otp_validation_error), mobilePhone);
        }
        if (i13 == 3) {
            return new l4(str != null ? me.iobyxmoadg(str, "text", str) : zv.zoijcleaow(R.string.spay_create_otp_attempts_exhausted_error), mobilePhone);
        }
        if (i13 == 4) {
            return new y9(str != null ? me.iobyxmoadg(str, "text", str) : zv.zoijcleaow(R.string.spay_create_otp_timeout_error), mobilePhone);
        }
        if (i13 == 8) {
            return new gc(str != null ? me.iobyxmoadg(str, "text", str) : zv.zoijcleaow(R.string.spay_create_otp_wrong_bundle_state_error), mobilePhone);
        }
        if (i13 == ORDER_NOT_FOUND_CODE) {
            return new q6(str != null ? me.iobyxmoadg(str, "text", str) : zv.zoijcleaow(R.string.spay_create_otp_order_not_found_error), mobilePhone);
        }
        if (i13 != BUNDLE_NOT_FOUND_CODE) {
            return new v8(str != null ? me.iobyxmoadg(str, "text", str) : zv.zoijcleaow(R.string.spay_create_otp_system_or_internal_error), mobilePhone);
        }
        return new n5(str != null ? me.iobyxmoadg(str, "text", str) : zv.zoijcleaow(R.string.spay_create_otp_bundle_not_found_error), mobilePhone);
    }

    public static /* synthetic */ jd creationOneTimePasswordState$default(String str, int i13, String str2, String str3, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            str2 = null;
        }
        if ((i14 & 8) != 0) {
            str3 = null;
        }
        return creationOneTimePasswordState(str, i13, str2, str3);
    }
}
