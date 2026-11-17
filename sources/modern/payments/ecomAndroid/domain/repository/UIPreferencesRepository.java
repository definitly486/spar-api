package modern.payments.ecomAndroid.domain.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.api.EcomUiPreferences;
import ng.iobyxmoadg;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "", "Lmodern/payments/ecomAndroid/api/EcomUiPreferences;", "preferences", "Lgg/wwaezpbzkn;", "setUIPreferences", "(Lmodern/payments/ecomAndroid/api/EcomUiPreferences;)V", "Lmodern/payments/ecomAndroid/api/EcomUiPreferences$EcomUIColorPreferences;", "getUIColorPreferences", "()Lmodern/payments/ecomAndroid/api/EcomUiPreferences$EcomUIColorPreferences;", "", "getUIRadius", "()Ljava/lang/Integer;", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$Font;", "font", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$FontParams;", "getUIFontParams", "(Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$Font;)Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$FontParams;", "clearUiPreferences", "()V", "ButtonType", "Font", "FontParams", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface UIPreferencesRepository {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$ButtonType;", "", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "TRANSPARENT", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum ButtonType {
        PRIMARY,
        SECONDARY,
        TRANSPARENT;

        private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());

        public static iobyxmoadg getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$Font;", "", "(Ljava/lang/String;I)V", "TITLE_1", "TITLE_2", "TITLE_3", "BODY", "FOOTNOTE", "CAPTION", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Font {
        TITLE_1,
        TITLE_2,
        TITLE_3,
        BODY,
        FOOTNOTE,
        CAPTION;

        private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());

        public static iobyxmoadg getEntries() {
            return $ENTRIES;
        }
    }

    void clearUiPreferences();

    EcomUiPreferences.EcomUIColorPreferences getUIColorPreferences();

    FontParams getUIFontParams(Font font);

    Integer getUIRadius();

    void setUIPreferences(EcomUiPreferences preferences);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J.\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000b¨\u0006\u001e"}, d2 = {"Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$FontParams;", "", "size", "", "lineHeight", "", "letterSpacing", "(FLjava/lang/Integer;F)V", "getLetterSpacing", "()F", "setLetterSpacing", "(F)V", "getLineHeight", "()Ljava/lang/Integer;", "setLineHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSize", "setSize", "component1", "component2", "component3", "copy", "(FLjava/lang/Integer;F)Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$FontParams;", "equals", "", "other", "hashCode", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FontParams {
        private float letterSpacing;
        private Integer lineHeight;
        private float size;

        public FontParams(float f13, Integer num, float f14) {
            this.size = f13;
            this.lineHeight = num;
            this.letterSpacing = f14;
        }

        public static /* synthetic */ FontParams copy$default(FontParams fontParams, float f13, Integer num, float f14, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                f13 = fontParams.size;
            }
            if ((i13 & 2) != 0) {
                num = fontParams.lineHeight;
            }
            if ((i13 & 4) != 0) {
                f14 = fontParams.letterSpacing;
            }
            return fontParams.copy(f13, num, f14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getLineHeight() {
            return this.lineHeight;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getLetterSpacing() {
            return this.letterSpacing;
        }

        public final FontParams copy(float size, Integer lineHeight, float letterSpacing) {
            return new FontParams(size, lineHeight, letterSpacing);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FontParams)) {
                return false;
            }
            FontParams fontParams = (FontParams) other;
            return Float.compare(this.size, fontParams.size) == 0 && zdlpuopuiu.eablkybsjg(this.lineHeight, fontParams.lineHeight) && Float.compare(this.letterSpacing, fontParams.letterSpacing) == 0;
        }

        public final float getLetterSpacing() {
            return this.letterSpacing;
        }

        public final Integer getLineHeight() {
            return this.lineHeight;
        }

        public final float getSize() {
            return this.size;
        }

        public int hashCode() {
            int iHashCode = Float.hashCode(this.size) * 31;
            Integer num = this.lineHeight;
            return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Float.hashCode(this.letterSpacing);
        }

        public final void setLetterSpacing(float f13) {
            this.letterSpacing = f13;
        }

        public final void setLineHeight(Integer num) {
            this.lineHeight = num;
        }

        public final void setSize(float f13) {
            this.size = f13;
        }

        public String toString() {
            return "FontParams(size=" + this.size + ", lineHeight=" + this.lineHeight + ", letterSpacing=" + this.letterSpacing + ')';
        }

        public /* synthetic */ FontParams(float f13, Integer num, float f14, int i13, gtknphoqwx gtknphoqwxVar) {
            this(f13, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? 0.0f : f14);
        }
    }
}
