package modern.payments.ecomAndroid.data.repository;

import android.content.Context;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.api.EcomUiPreferences;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import ng.iobyxmoadg;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\b\u0000\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR,\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lmodern/payments/ecomAndroid/data/repository/UIPreferencesRepositoryImpl;", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lmodern/payments/ecomAndroid/api/EcomUiPreferences$SBTextSize;", "Lmodern/payments/ecomAndroid/data/repository/UIPreferencesRepositoryImpl$FontSize;", "toFontSize", "(Lmodern/payments/ecomAndroid/api/EcomUiPreferences$SBTextSize;)Lmodern/payments/ecomAndroid/data/repository/UIPreferencesRepositoryImpl$FontSize;", "Lmodern/payments/ecomAndroid/api/EcomUiPreferences;", "preferences", "Lgg/wwaezpbzkn;", "setUIPreferences", "(Lmodern/payments/ecomAndroid/api/EcomUiPreferences;)V", "Lmodern/payments/ecomAndroid/api/EcomUiPreferences$EcomUIColorPreferences;", "getUIColorPreferences", "()Lmodern/payments/ecomAndroid/api/EcomUiPreferences$EcomUIColorPreferences;", "", "getUIRadius", "()Ljava/lang/Integer;", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$Font;", "font", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$FontParams;", "getUIFontParams", "(Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$Font;)Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$FontParams;", "clearUiPreferences", "()V", "Landroid/content/Context;", "Lmodern/payments/ecomAndroid/api/EcomUiPreferences;", "", "fontParams", "Ljava/util/Map;", "Companion", "FontSize", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UIPreferencesRepositoryImpl implements UIPreferencesRepository {
    public static final int DEFAULT_RADIUS_L = 24;
    public static final int DEFAULT_RADIUS_M = 16;
    public static final int DEFAULT_RADIUS_S = 8;
    private static final float MAX_FONT_SCALE_RATIO_TO_SKIP = 1.7f;
    private final Context context;
    private final Map<UIPreferencesRepository.Font, Map<FontSize, UIPreferencesRepository.FontParams>> fontParams;
    private EcomUiPreferences preferences;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/data/repository/UIPreferencesRepositoryImpl$FontSize;", "", "(Ljava/lang/String;I)V", "EXTRA_S", "S", "M", "L", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private enum FontSize {
        EXTRA_S,
        S,
        M,
        L;

        private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());

        public static iobyxmoadg getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EcomUiPreferences.SBRadiusSize.values().length];
            try {
                iArr[EcomUiPreferences.SBRadiusSize.S.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EcomUiPreferences.SBRadiusSize.M.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EcomUiPreferences.SBRadiusSize.L.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UIPreferencesRepositoryImpl(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.context = context;
        UIPreferencesRepository.Font font = UIPreferencesRepository.Font.TITLE_1;
        FontSize fontSize = FontSize.EXTRA_S;
        vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(fontSize, new UIPreferencesRepository.FontParams(30.0f, 38, 0.0f, 4, null));
        FontSize fontSize2 = FontSize.S;
        vdvldrhtss vdvldrhtssVarIobyxmoadg2 = cqumvgiudr.iobyxmoadg(fontSize2, new UIPreferencesRepository.FontParams(32.0f, 40, 0.0f, 4, null));
        FontSize fontSize3 = FontSize.M;
        vdvldrhtss vdvldrhtssVarIobyxmoadg3 = cqumvgiudr.iobyxmoadg(fontSize3, new UIPreferencesRepository.FontParams(36.0f, 42, 0.0f, 4, null));
        FontSize fontSize4 = FontSize.L;
        this.fontParams = tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg(font, tzroggbefp.draadjrbmk(vdvldrhtssVarIobyxmoadg, vdvldrhtssVarIobyxmoadg2, vdvldrhtssVarIobyxmoadg3, cqumvgiudr.iobyxmoadg(fontSize4, new UIPreferencesRepository.FontParams(40.0f, 46, 0.0f, 4, null)))), cqumvgiudr.iobyxmoadg(UIPreferencesRepository.Font.TITLE_2, tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg(fontSize, new UIPreferencesRepository.FontParams(22.0f, 26, 0.0f, 4, null)), cqumvgiudr.iobyxmoadg(fontSize2, new UIPreferencesRepository.FontParams(24.0f, 28, 0.0f, 4, null)), cqumvgiudr.iobyxmoadg(fontSize3, new UIPreferencesRepository.FontParams(30.0f, 36, 0.0f, 4, null)), cqumvgiudr.iobyxmoadg(fontSize4, new UIPreferencesRepository.FontParams(36.0f, 42, 0.0f, 4, null)))), cqumvgiudr.iobyxmoadg(UIPreferencesRepository.Font.TITLE_3, tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg(fontSize, new UIPreferencesRepository.FontParams(14.0f, 22, -2.3f)), cqumvgiudr.iobyxmoadg(fontSize2, new UIPreferencesRepository.FontParams(16.0f, 24, -2.3f)), cqumvgiudr.iobyxmoadg(fontSize3, new UIPreferencesRepository.FontParams(24.0f, 28, 0.0f, 4, null)), cqumvgiudr.iobyxmoadg(fontSize4, new UIPreferencesRepository.FontParams(28.0f, 34, 0.0f, 4, null)))), cqumvgiudr.iobyxmoadg(UIPreferencesRepository.Font.BODY, tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg(fontSize, new UIPreferencesRepository.FontParams(12.0f, 16, -2.3f)), cqumvgiudr.iobyxmoadg(fontSize2, new UIPreferencesRepository.FontParams(14.0f, 18, -2.3f)), cqumvgiudr.iobyxmoadg(fontSize3, new UIPreferencesRepository.FontParams(16.0f, 24, -2.3f)), cqumvgiudr.iobyxmoadg(fontSize4, new UIPreferencesRepository.FontParams(20.0f, 28, -2.3f)))), cqumvgiudr.iobyxmoadg(UIPreferencesRepository.Font.FOOTNOTE, tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg(fontSize, new UIPreferencesRepository.FontParams(10.0f, 16, -2.3f)), cqumvgiudr.iobyxmoadg(fontSize2, new UIPreferencesRepository.FontParams(12.0f, 18, -2.3f)), cqumvgiudr.iobyxmoadg(fontSize3, new UIPreferencesRepository.FontParams(14.0f, 18, -2.3f)), cqumvgiudr.iobyxmoadg(fontSize4, new UIPreferencesRepository.FontParams(16.0f, 24, -2.3f)))), cqumvgiudr.iobyxmoadg(UIPreferencesRepository.Font.CAPTION, tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg(fontSize, new UIPreferencesRepository.FontParams(10.0f, 16, -2.3f)), cqumvgiudr.iobyxmoadg(fontSize2, new UIPreferencesRepository.FontParams(12.0f, 18, -2.3f)), cqumvgiudr.iobyxmoadg(fontSize3, new UIPreferencesRepository.FontParams(12.0f, 18, -2.3f)), cqumvgiudr.iobyxmoadg(fontSize4, new UIPreferencesRepository.FontParams(14.0f, 18, -2.3f)))));
    }

    private final FontSize toFontSize(EcomUiPreferences.SBTextSize sBTextSize) {
        if (sBTextSize == EcomUiPreferences.SBTextSize.S) {
            return FontSize.S;
        }
        if (sBTextSize == EcomUiPreferences.SBTextSize.M) {
            return FontSize.M;
        }
        EcomUiPreferences.SBTextSize sBTextSize2 = EcomUiPreferences.SBTextSize.L;
        if (sBTextSize != sBTextSize2 || this.context.getResources().getConfiguration().fontScale < MAX_FONT_SCALE_RATIO_TO_SKIP) {
            return (sBTextSize != sBTextSize2 || this.context.getResources().getConfiguration().fontScale >= MAX_FONT_SCALE_RATIO_TO_SKIP) ? FontSize.M : FontSize.L;
        }
        return FontSize.EXTRA_S;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository
    public void clearUiPreferences() {
        this.preferences = new EcomUiPreferences(new EcomUiPreferences.EcomUIColorPreferences(null, null, null, null, null, null, null, null, null, null, null, 2047, null), new EcomUiPreferences.EcomUIColorPreferences(null, null, null, null, null, null, null, null, null, null, null, 2047, null), new EcomUiPreferences.EcomUICommonPreferences(null, null, 3, null));
    }

    @Override // modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository
    public EcomUiPreferences.EcomUIColorPreferences getUIColorPreferences() {
        EcomUiPreferences ecomUiPreferences;
        int i13 = this.context.getApplicationContext().getTheme().getResources().getConfiguration().uiMode & 48;
        if (i13 != 16) {
            if (i13 == 32 && (ecomUiPreferences = this.preferences) != null) {
                return ecomUiPreferences.getDarkTheme();
            }
            return null;
        }
        EcomUiPreferences ecomUiPreferences2 = this.preferences;
        if (ecomUiPreferences2 != null) {
            return ecomUiPreferences2.getLightTheme();
        }
        return null;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository
    public UIPreferencesRepository.FontParams getUIFontParams(UIPreferencesRepository.Font font) {
        EcomUiPreferences.EcomUICommonPreferences common;
        zdlpuopuiu.btonecajqb(font, "font");
        Map<FontSize, UIPreferencesRepository.FontParams> map = this.fontParams.get(font);
        EcomUiPreferences.SBTextSize textSize = null;
        if (map == null) {
            return null;
        }
        EcomUiPreferences ecomUiPreferences = this.preferences;
        if (ecomUiPreferences != null && (common = ecomUiPreferences.getCommon()) != null) {
            textSize = common.getTextSize();
        }
        return map.get(toFontSize(textSize));
    }

    @Override // modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository
    public Integer getUIRadius() {
        EcomUiPreferences.EcomUICommonPreferences common;
        EcomUiPreferences ecomUiPreferences = this.preferences;
        EcomUiPreferences.SBRadiusSize radiusSize = (ecomUiPreferences == null || (common = ecomUiPreferences.getCommon()) == null) ? null : common.getRadiusSize();
        int i13 = radiusSize == null ? -1 : WhenMappings.$EnumSwitchMapping$0[radiusSize.ordinal()];
        if (i13 == 1) {
            return 8;
        }
        if (i13 != 2) {
            return i13 != 3 ? null : 24;
        }
        return 16;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository
    public void setUIPreferences(EcomUiPreferences preferences) {
        this.preferences = preferences == null ? new EcomUiPreferences(new EcomUiPreferences.EcomUIColorPreferences(null, null, null, null, null, null, null, null, null, null, null, 2047, null), new EcomUiPreferences.EcomUIColorPreferences(null, null, null, null, null, null, null, null, null, null, null, 2047, null), new EcomUiPreferences.EcomUICommonPreferences(null, null, 3, null)) : preferences;
    }
}
