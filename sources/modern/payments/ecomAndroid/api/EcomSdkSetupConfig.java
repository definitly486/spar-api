package modern.payments.ecomAndroid.api;

import android.content.Context;
import hg.jyumaefscl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.Stage;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r\u0012\"\b\u0002\u0010\u0013\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b \u0010!J*\u0010\"\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0084\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r2\"\b\u0002\u0010\u0013\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\u001dR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010\u001fR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u0010!R1\u0010\u0013\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b9\u0010!¨\u0006:"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomSdkSetupConfig;", "", "Landroid/content/Context;", "context", "Lmodern/payments/ecomAndroid/api/EcomUiPreferences;", "ecomUiPreferences", "Lmodern/payments/ecomAndroid/Stage;", "stage", "", "Lmodern/payments/ecomAndroid/api/EcomSdkFeature;", "disabledFeatures", "", "enableLogging", "Lkotlin/Function1;", "Lgg/wwaezpbzkn;", "callback", "Lgg/vdvldrhtss;", "Lmodern/payments/ecomAndroid/api/analytic/model/AnalyticalEvent;", "", "metricCallback", "<init>", "(Landroid/content/Context;Lmodern/payments/ecomAndroid/api/EcomUiPreferences;Lmodern/payments/ecomAndroid/Stage;Ljava/util/List;ZLtg/draadjrbmk;Ltg/draadjrbmk;)V", "component1", "()Landroid/content/Context;", "component2", "()Lmodern/payments/ecomAndroid/api/EcomUiPreferences;", "component3", "()Lmodern/payments/ecomAndroid/Stage;", "component4", "()Ljava/util/List;", "component5", "()Z", "component6", "()Ltg/draadjrbmk;", "component7", "copy", "(Landroid/content/Context;Lmodern/payments/ecomAndroid/api/EcomUiPreferences;Lmodern/payments/ecomAndroid/Stage;Ljava/util/List;ZLtg/draadjrbmk;Ltg/draadjrbmk;)Lmodern/payments/ecomAndroid/api/EcomSdkSetupConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "getContext", "Lmodern/payments/ecomAndroid/api/EcomUiPreferences;", "getEcomUiPreferences", "Lmodern/payments/ecomAndroid/Stage;", "getStage", "Ljava/util/List;", "getDisabledFeatures", "Z", "getEnableLogging", "Ltg/draadjrbmk;", "getCallback", "getMetricCallback", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EcomSdkSetupConfig {
    private final draadjrbmk callback;
    private final Context context;
    private final List<EcomSdkFeature> disabledFeatures;
    private final EcomUiPreferences ecomUiPreferences;
    private final boolean enableLogging;
    private final draadjrbmk metricCallback;
    private final Stage stage;

    /* JADX WARN: Multi-variable type inference failed */
    public EcomSdkSetupConfig(Context context, EcomUiPreferences ecomUiPreferences, Stage stage, List<? extends EcomSdkFeature> disabledFeatures, boolean z13, draadjrbmk callback, draadjrbmk draadjrbmkVar) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(stage, "stage");
        zdlpuopuiu.btonecajqb(disabledFeatures, "disabledFeatures");
        zdlpuopuiu.btonecajqb(callback, "callback");
        this.context = context;
        this.ecomUiPreferences = ecomUiPreferences;
        this.stage = stage;
        this.disabledFeatures = disabledFeatures;
        this.enableLogging = z13;
        this.callback = callback;
        this.metricCallback = draadjrbmkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EcomSdkSetupConfig copy$default(EcomSdkSetupConfig ecomSdkSetupConfig, Context context, EcomUiPreferences ecomUiPreferences, Stage stage, List list, boolean z13, draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            context = ecomSdkSetupConfig.context;
        }
        if ((i13 & 2) != 0) {
            ecomUiPreferences = ecomSdkSetupConfig.ecomUiPreferences;
        }
        EcomUiPreferences ecomUiPreferences2 = ecomUiPreferences;
        if ((i13 & 4) != 0) {
            stage = ecomSdkSetupConfig.stage;
        }
        Stage stage2 = stage;
        if ((i13 & 8) != 0) {
            list = ecomSdkSetupConfig.disabledFeatures;
        }
        List list2 = list;
        if ((i13 & 16) != 0) {
            z13 = ecomSdkSetupConfig.enableLogging;
        }
        boolean z14 = z13;
        if ((i13 & 32) != 0) {
            draadjrbmkVar = ecomSdkSetupConfig.callback;
        }
        draadjrbmk draadjrbmkVar3 = draadjrbmkVar;
        if ((i13 & 64) != 0) {
            draadjrbmkVar2 = ecomSdkSetupConfig.metricCallback;
        }
        return ecomSdkSetupConfig.copy(context, ecomUiPreferences2, stage2, list2, z14, draadjrbmkVar3, draadjrbmkVar2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EcomUiPreferences getEcomUiPreferences() {
        return this.ecomUiPreferences;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Stage getStage() {
        return this.stage;
    }

    public final List<EcomSdkFeature> component4() {
        return this.disabledFeatures;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnableLogging() {
        return this.enableLogging;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final draadjrbmk getCallback() {
        return this.callback;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final draadjrbmk getMetricCallback() {
        return this.metricCallback;
    }

    public final EcomSdkSetupConfig copy(Context context, EcomUiPreferences ecomUiPreferences, Stage stage, List<? extends EcomSdkFeature> disabledFeatures, boolean enableLogging, draadjrbmk callback, draadjrbmk metricCallback) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(stage, "stage");
        zdlpuopuiu.btonecajqb(disabledFeatures, "disabledFeatures");
        zdlpuopuiu.btonecajqb(callback, "callback");
        return new EcomSdkSetupConfig(context, ecomUiPreferences, stage, disabledFeatures, enableLogging, callback, metricCallback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcomSdkSetupConfig)) {
            return false;
        }
        EcomSdkSetupConfig ecomSdkSetupConfig = (EcomSdkSetupConfig) other;
        return zdlpuopuiu.eablkybsjg(this.context, ecomSdkSetupConfig.context) && zdlpuopuiu.eablkybsjg(this.ecomUiPreferences, ecomSdkSetupConfig.ecomUiPreferences) && zdlpuopuiu.eablkybsjg(this.stage, ecomSdkSetupConfig.stage) && zdlpuopuiu.eablkybsjg(this.disabledFeatures, ecomSdkSetupConfig.disabledFeatures) && this.enableLogging == ecomSdkSetupConfig.enableLogging && zdlpuopuiu.eablkybsjg(this.callback, ecomSdkSetupConfig.callback) && zdlpuopuiu.eablkybsjg(this.metricCallback, ecomSdkSetupConfig.metricCallback);
    }

    public final draadjrbmk getCallback() {
        return this.callback;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<EcomSdkFeature> getDisabledFeatures() {
        return this.disabledFeatures;
    }

    public final EcomUiPreferences getEcomUiPreferences() {
        return this.ecomUiPreferences;
    }

    public final boolean getEnableLogging() {
        return this.enableLogging;
    }

    public final draadjrbmk getMetricCallback() {
        return this.metricCallback;
    }

    public final Stage getStage() {
        return this.stage;
    }

    public int hashCode() {
        int iHashCode = this.context.hashCode() * 31;
        EcomUiPreferences ecomUiPreferences = this.ecomUiPreferences;
        int iHashCode2 = (((((((((iHashCode + (ecomUiPreferences == null ? 0 : ecomUiPreferences.hashCode())) * 31) + this.stage.hashCode()) * 31) + this.disabledFeatures.hashCode()) * 31) + Boolean.hashCode(this.enableLogging)) * 31) + this.callback.hashCode()) * 31;
        draadjrbmk draadjrbmkVar = this.metricCallback;
        return iHashCode2 + (draadjrbmkVar != null ? draadjrbmkVar.hashCode() : 0);
    }

    public String toString() {
        return "EcomSdkSetupConfig(context=" + this.context + ", ecomUiPreferences=" + this.ecomUiPreferences + ", stage=" + this.stage + ", disabledFeatures=" + this.disabledFeatures + ", enableLogging=" + this.enableLogging + ", callback=" + this.callback + ", metricCallback=" + this.metricCallback + ')';
    }

    public /* synthetic */ EcomSdkSetupConfig(Context context, EcomUiPreferences ecomUiPreferences, Stage stage, List list, boolean z13, draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, int i13, gtknphoqwx gtknphoqwxVar) {
        this(context, (i13 & 2) != 0 ? null : ecomUiPreferences, stage, (i13 & 8) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 16) != 0 ? false : z13, draadjrbmkVar, (i13 & 64) != 0 ? null : draadjrbmkVar2);
    }
}
