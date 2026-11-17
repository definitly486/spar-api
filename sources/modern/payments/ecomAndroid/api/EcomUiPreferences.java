package modern.payments.ecomAndroid.api;

import android.graphics.Color;
import android.webkit.URLUtil;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ng.iobyxmoadg;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0005\u0018\u0019\u001a\u001b\u001cB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomUiPreferences;", "", "lightTheme", "Lmodern/payments/ecomAndroid/api/EcomUiPreferences$EcomUIColorPreferences;", "darkTheme", "common", "Lmodern/payments/ecomAndroid/api/EcomUiPreferences$EcomUICommonPreferences;", "(Lmodern/payments/ecomAndroid/api/EcomUiPreferences$EcomUIColorPreferences;Lmodern/payments/ecomAndroid/api/EcomUiPreferences$EcomUIColorPreferences;Lmodern/payments/ecomAndroid/api/EcomUiPreferences$EcomUICommonPreferences;)V", "getCommon", "()Lmodern/payments/ecomAndroid/api/EcomUiPreferences$EcomUICommonPreferences;", "getDarkTheme", "()Lmodern/payments/ecomAndroid/api/EcomUiPreferences$EcomUIColorPreferences;", "getLightTheme", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "EcomUIColorPreferences", "EcomUICommonPreferences", "SBRadiusSize", "SBTextSize", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EcomUiPreferences {
    public static final String DEFAULT_ACCENT_ERROR_COLOR = "#FF2E43";
    public static final String DEFAULT_ACCENT_SUCCESS_COLOR = "#148F2B";
    public static final String DEFAULT_BUTTON_SECONDARY_COLOR = "#272727";
    public static final float DEFAULT_FADE_ALPHA = 0.55f;
    public static final String DEFAULT_FADE_COLOR = "#000000";
    public static final String DEFAULT_INPUT_BG_COLOR = "#FFFFFF";
    public static final String DEFAULT_LOADER_COLOR = "#000000";
    public static final String DEFAULT_MAIN_BG_COLOR = "#F5F5F5";
    public static final String DEFAULT_TEXT_BUTTON_COLOR = "#FFFFFF";
    public static final String DEFAULT_TEXT_PRIMARY_COLOR = "#000000";
    public static final String DEFAULT_TEXT_SECONDARY_COLOR = "#6E6E6E";
    private final EcomUICommonPreferences common;
    private final EcomUIColorPreferences darkTheme;
    private final EcomUIColorPreferences lightTheme;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\b\u0010&\u001a\u00020\u0003H\u0016R\u001e\u0010\n\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\t\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001e\u0010\f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R*\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u001e\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012R\"\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001e\u0010\b\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0012R\u001e\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0012¨\u0006'"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomUiPreferences$EcomUIColorPreferences;", "", "inputBG", "", "mainBG", "fade", "textPrimary", "textSecondary", "textButton", "accentSuccess", "accentError", "loader", "buttonSecondary", "merchantIcon", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "<set-?>", "", "getAccentError", "()I", "getAccentSuccess", "getButtonSecondary", "getFade", "value", "", "fadeAlpha", "getFadeAlpha", "()Ljava/lang/Float;", "setFadeAlpha", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getInputBG", "getLoader", "getMainBG", "getMerchantIcon", "()Ljava/lang/String;", "getTextButton", "getTextPrimary", "getTextSecondary", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EcomUIColorPreferences {
        private int accentError;
        private int accentSuccess;
        private int buttonSecondary;
        private int fade;
        private Float fadeAlpha;
        private int inputBG;
        private int loader;
        private int mainBG;
        private String merchantIcon;
        private int textButton;
        private int textPrimary;
        private int textSecondary;

        public EcomUIColorPreferences() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        public final int getAccentError() {
            return this.accentError;
        }

        public final int getAccentSuccess() {
            return this.accentSuccess;
        }

        public final int getButtonSecondary() {
            return this.buttonSecondary;
        }

        public final int getFade() {
            return this.fade;
        }

        public final Float getFadeAlpha() {
            return this.fadeAlpha;
        }

        public final int getInputBG() {
            return this.inputBG;
        }

        public final int getLoader() {
            return this.loader;
        }

        public final int getMainBG() {
            return this.mainBG;
        }

        public final String getMerchantIcon() {
            return this.merchantIcon;
        }

        public final int getTextButton() {
            return this.textButton;
        }

        public final int getTextPrimary() {
            return this.textPrimary;
        }

        public final int getTextSecondary() {
            return this.textSecondary;
        }

        public final void setFadeAlpha(Float f13) {
            if (f13 == null) {
                f13 = Float.valueOf(0.55f);
            }
            this.fadeAlpha = f13;
        }

        public String toString() {
            return "EcomUIColorPreferences(inputBG=" + this.inputBG + ", mainBG=" + this.mainBG + ", fade=" + this.fade + ", fadeAlpha=" + this.fadeAlpha + ", textPrimary=" + this.textPrimary + ", textSecondary=" + this.textSecondary + ", textButton=" + this.textButton + ", accentSuccess=" + this.accentSuccess + ", accentError=" + this.accentError + ", loader=" + this.loader + ", buttonSecondary=" + this.buttonSecondary + ", merchantIcon=" + this.merchantIcon + ')';
        }

        public EcomUIColorPreferences(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.inputBG = Color.parseColor(EcomUiPreferencesKt.getColorOrDefault(str, "#FFFFFF"));
            this.mainBG = Color.parseColor(EcomUiPreferencesKt.getColorOrDefault(str2, EcomUiPreferences.DEFAULT_MAIN_BG_COLOR));
            this.fade = Color.parseColor(EcomUiPreferencesKt.getColorOrDefault(str3, "#000000"));
            this.textPrimary = Color.parseColor(EcomUiPreferencesKt.getColorOrDefault(str4, "#000000"));
            this.textSecondary = Color.parseColor(EcomUiPreferencesKt.getColorOrDefault(str5, EcomUiPreferences.DEFAULT_TEXT_SECONDARY_COLOR));
            this.textButton = Color.parseColor(EcomUiPreferencesKt.getColorOrDefault(str6, "#FFFFFF"));
            this.accentSuccess = Color.parseColor(EcomUiPreferencesKt.getColorOrDefault(str7, EcomUiPreferences.DEFAULT_ACCENT_SUCCESS_COLOR));
            this.accentError = Color.parseColor(EcomUiPreferencesKt.getColorOrDefault(str8, EcomUiPreferences.DEFAULT_ACCENT_ERROR_COLOR));
            this.loader = Color.parseColor(EcomUiPreferencesKt.getColorOrDefault(str9, "#000000"));
            this.buttonSecondary = Color.parseColor(EcomUiPreferencesKt.getColorOrDefault(str10, EcomUiPreferences.DEFAULT_BUTTON_SECONDARY_COLOR));
            this.merchantIcon = URLUtil.isValidUrl(str11) ? str11 : null;
        }

        public /* synthetic */ EcomUIColorPreferences(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str8, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str9, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str10, (i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0 ? str11 : null);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomUiPreferences$EcomUICommonPreferences;", "", "radiusSize", "Lmodern/payments/ecomAndroid/api/EcomUiPreferences$SBRadiusSize;", "textSize", "Lmodern/payments/ecomAndroid/api/EcomUiPreferences$SBTextSize;", "(Lmodern/payments/ecomAndroid/api/EcomUiPreferences$SBRadiusSize;Lmodern/payments/ecomAndroid/api/EcomUiPreferences$SBTextSize;)V", "getRadiusSize", "()Lmodern/payments/ecomAndroid/api/EcomUiPreferences$SBRadiusSize;", "getTextSize", "()Lmodern/payments/ecomAndroid/api/EcomUiPreferences$SBTextSize;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EcomUICommonPreferences {
        private final SBRadiusSize radiusSize;
        private final SBTextSize textSize;

        /* JADX WARN: Multi-variable type inference failed */
        public EcomUICommonPreferences() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ EcomUICommonPreferences copy$default(EcomUICommonPreferences ecomUICommonPreferences, SBRadiusSize sBRadiusSize, SBTextSize sBTextSize, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                sBRadiusSize = ecomUICommonPreferences.radiusSize;
            }
            if ((i13 & 2) != 0) {
                sBTextSize = ecomUICommonPreferences.textSize;
            }
            return ecomUICommonPreferences.copy(sBRadiusSize, sBTextSize);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SBRadiusSize getRadiusSize() {
            return this.radiusSize;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SBTextSize getTextSize() {
            return this.textSize;
        }

        public final EcomUICommonPreferences copy(SBRadiusSize radiusSize, SBTextSize textSize) {
            return new EcomUICommonPreferences(radiusSize, textSize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EcomUICommonPreferences)) {
                return false;
            }
            EcomUICommonPreferences ecomUICommonPreferences = (EcomUICommonPreferences) other;
            return this.radiusSize == ecomUICommonPreferences.radiusSize && this.textSize == ecomUICommonPreferences.textSize;
        }

        public final SBRadiusSize getRadiusSize() {
            return this.radiusSize;
        }

        public final SBTextSize getTextSize() {
            return this.textSize;
        }

        public int hashCode() {
            SBRadiusSize sBRadiusSize = this.radiusSize;
            int iHashCode = (sBRadiusSize == null ? 0 : sBRadiusSize.hashCode()) * 31;
            SBTextSize sBTextSize = this.textSize;
            return iHashCode + (sBTextSize != null ? sBTextSize.hashCode() : 0);
        }

        public String toString() {
            return "EcomUICommonPreferences(radiusSize=" + this.radiusSize + ", textSize=" + this.textSize + ')';
        }

        public EcomUICommonPreferences(SBRadiusSize sBRadiusSize, SBTextSize sBTextSize) {
            this.radiusSize = sBRadiusSize;
            this.textSize = sBTextSize;
        }

        public /* synthetic */ EcomUICommonPreferences(SBRadiusSize sBRadiusSize, SBTextSize sBTextSize, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? SBRadiusSize.M : sBRadiusSize, (i13 & 2) != 0 ? SBTextSize.M : sBTextSize);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomUiPreferences$SBRadiusSize;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "S", "M", "L", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum SBRadiusSize {
        S("s"),
        M("m"),
        L("l");

        private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
        private final String value;

        SBRadiusSize(String str) {
            this.value = str;
        }

        public static iobyxmoadg getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomUiPreferences$SBTextSize;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "S", "M", "L", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum SBTextSize {
        S("s"),
        M("m"),
        L("l");

        private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
        private final String value;

        SBTextSize(String str) {
            this.value = str;
        }

        public static iobyxmoadg getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public EcomUiPreferences() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ EcomUiPreferences copy$default(EcomUiPreferences ecomUiPreferences, EcomUIColorPreferences ecomUIColorPreferences, EcomUIColorPreferences ecomUIColorPreferences2, EcomUICommonPreferences ecomUICommonPreferences, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            ecomUIColorPreferences = ecomUiPreferences.lightTheme;
        }
        if ((i13 & 2) != 0) {
            ecomUIColorPreferences2 = ecomUiPreferences.darkTheme;
        }
        if ((i13 & 4) != 0) {
            ecomUICommonPreferences = ecomUiPreferences.common;
        }
        return ecomUiPreferences.copy(ecomUIColorPreferences, ecomUIColorPreferences2, ecomUICommonPreferences);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EcomUIColorPreferences getLightTheme() {
        return this.lightTheme;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EcomUIColorPreferences getDarkTheme() {
        return this.darkTheme;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EcomUICommonPreferences getCommon() {
        return this.common;
    }

    public final EcomUiPreferences copy(EcomUIColorPreferences lightTheme, EcomUIColorPreferences darkTheme, EcomUICommonPreferences common) {
        return new EcomUiPreferences(lightTheme, darkTheme, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcomUiPreferences)) {
            return false;
        }
        EcomUiPreferences ecomUiPreferences = (EcomUiPreferences) other;
        return zdlpuopuiu.eablkybsjg(this.lightTheme, ecomUiPreferences.lightTheme) && zdlpuopuiu.eablkybsjg(this.darkTheme, ecomUiPreferences.darkTheme) && zdlpuopuiu.eablkybsjg(this.common, ecomUiPreferences.common);
    }

    public final EcomUICommonPreferences getCommon() {
        return this.common;
    }

    public final EcomUIColorPreferences getDarkTheme() {
        return this.darkTheme;
    }

    public final EcomUIColorPreferences getLightTheme() {
        return this.lightTheme;
    }

    public int hashCode() {
        EcomUIColorPreferences ecomUIColorPreferences = this.lightTheme;
        int iHashCode = (ecomUIColorPreferences == null ? 0 : ecomUIColorPreferences.hashCode()) * 31;
        EcomUIColorPreferences ecomUIColorPreferences2 = this.darkTheme;
        int iHashCode2 = (iHashCode + (ecomUIColorPreferences2 == null ? 0 : ecomUIColorPreferences2.hashCode())) * 31;
        EcomUICommonPreferences ecomUICommonPreferences = this.common;
        return iHashCode2 + (ecomUICommonPreferences != null ? ecomUICommonPreferences.hashCode() : 0);
    }

    public String toString() {
        return "EcomUiPreferences(lightTheme=" + this.lightTheme + ", darkTheme=" + this.darkTheme + ", common=" + this.common + ')';
    }

    public EcomUiPreferences(EcomUIColorPreferences ecomUIColorPreferences, EcomUIColorPreferences ecomUIColorPreferences2, EcomUICommonPreferences ecomUICommonPreferences) {
        this.lightTheme = ecomUIColorPreferences;
        this.darkTheme = ecomUIColorPreferences2;
        this.common = ecomUICommonPreferences;
    }

    public /* synthetic */ EcomUiPreferences(EcomUIColorPreferences ecomUIColorPreferences, EcomUIColorPreferences ecomUIColorPreferences2, EcomUICommonPreferences ecomUICommonPreferences, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : ecomUIColorPreferences, (i13 & 2) != 0 ? null : ecomUIColorPreferences2, (i13 & 4) != 0 ? null : ecomUICommonPreferences);
    }
}
