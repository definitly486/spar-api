package spay.sdk.api;

import hg.jyumaefscl;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.data.dto.SPaySdkInitConfigDto;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jl\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b5\u0010\u0016R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010 ¨\u00068"}, d2 = {"Lspay/sdk/api/SPaySdkInitConfig;", "", "", "enableBnpl", "Lspay/sdk/api/SPayStage;", "stage", "Lspay/sdk/api/SPayHelperConfig;", "helperConfig", "spasiboBonuses", "resultViewNeeded", "enableLogging", "enableOutsideTouchCancelling", "Lkotlin/Function1;", "Lspay/sdk/api/InitializationResult;", "Lgg/wwaezpbzkn;", "initializationResult", "<init>", "(ZLspay/sdk/api/SPayStage;Lspay/sdk/api/SPayHelperConfig;ZZZZLtg/draadjrbmk;)V", "Lspay/sdk/data/dto/SPaySdkInitConfigDto;", "toSPaySdkInitConfigDto", "()Lspay/sdk/data/dto/SPaySdkInitConfigDto;", "component1", "()Z", "component2", "()Lspay/sdk/api/SPayStage;", "component3", "()Lspay/sdk/api/SPayHelperConfig;", "component4", "component5", "component6", "component7", "component8", "()Ltg/draadjrbmk;", "copy", "(ZLspay/sdk/api/SPayStage;Lspay/sdk/api/SPayHelperConfig;ZZZZLtg/draadjrbmk;)Lspay/sdk/api/SPaySdkInitConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnableBnpl", "Lspay/sdk/api/SPayStage;", "getStage", "Lspay/sdk/api/SPayHelperConfig;", "getHelperConfig", "getSpasiboBonuses", "getResultViewNeeded", "getEnableLogging", "getEnableOutsideTouchCancelling", "Ltg/draadjrbmk;", "getInitializationResult", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SPaySdkInitConfig {
    private final boolean enableBnpl;
    private final boolean enableLogging;
    private final boolean enableOutsideTouchCancelling;
    private final SPayHelperConfig helperConfig;
    private final draadjrbmk initializationResult;
    private final boolean resultViewNeeded;
    private final boolean spasiboBonuses;
    private final SPayStage stage;

    public SPaySdkInitConfig(boolean z13, SPayStage stage, SPayHelperConfig helperConfig, boolean z14, boolean z15, boolean z16, boolean z17, draadjrbmk initializationResult) {
        zdlpuopuiu.btonecajqb(stage, "stage");
        zdlpuopuiu.btonecajqb(helperConfig, "helperConfig");
        zdlpuopuiu.btonecajqb(initializationResult, "initializationResult");
        this.enableBnpl = z13;
        this.stage = stage;
        this.helperConfig = helperConfig;
        this.spasiboBonuses = z14;
        this.resultViewNeeded = z15;
        this.enableLogging = z16;
        this.enableOutsideTouchCancelling = z17;
        this.initializationResult = initializationResult;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnableBnpl() {
        return this.enableBnpl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SPayStage getStage() {
        return this.stage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SPayHelperConfig getHelperConfig() {
        return this.helperConfig;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSpasiboBonuses() {
        return this.spasiboBonuses;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getResultViewNeeded() {
        return this.resultViewNeeded;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getEnableLogging() {
        return this.enableLogging;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getEnableOutsideTouchCancelling() {
        return this.enableOutsideTouchCancelling;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final draadjrbmk getInitializationResult() {
        return this.initializationResult;
    }

    public final SPaySdkInitConfig copy(boolean enableBnpl, SPayStage stage, SPayHelperConfig helperConfig, boolean spasiboBonuses, boolean resultViewNeeded, boolean enableLogging, boolean enableOutsideTouchCancelling, draadjrbmk initializationResult) {
        zdlpuopuiu.btonecajqb(stage, "stage");
        zdlpuopuiu.btonecajqb(helperConfig, "helperConfig");
        zdlpuopuiu.btonecajqb(initializationResult, "initializationResult");
        return new SPaySdkInitConfig(enableBnpl, stage, helperConfig, spasiboBonuses, resultViewNeeded, enableLogging, enableOutsideTouchCancelling, initializationResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPaySdkInitConfig)) {
            return false;
        }
        SPaySdkInitConfig sPaySdkInitConfig = (SPaySdkInitConfig) other;
        return this.enableBnpl == sPaySdkInitConfig.enableBnpl && this.stage == sPaySdkInitConfig.stage && zdlpuopuiu.eablkybsjg(this.helperConfig, sPaySdkInitConfig.helperConfig) && this.spasiboBonuses == sPaySdkInitConfig.spasiboBonuses && this.resultViewNeeded == sPaySdkInitConfig.resultViewNeeded && this.enableLogging == sPaySdkInitConfig.enableLogging && this.enableOutsideTouchCancelling == sPaySdkInitConfig.enableOutsideTouchCancelling && zdlpuopuiu.eablkybsjg(this.initializationResult, sPaySdkInitConfig.initializationResult);
    }

    public final boolean getEnableBnpl() {
        return this.enableBnpl;
    }

    public final boolean getEnableLogging() {
        return this.enableLogging;
    }

    public final boolean getEnableOutsideTouchCancelling() {
        return this.enableOutsideTouchCancelling;
    }

    public final SPayHelperConfig getHelperConfig() {
        return this.helperConfig;
    }

    public final draadjrbmk getInitializationResult() {
        return this.initializationResult;
    }

    public final boolean getResultViewNeeded() {
        return this.resultViewNeeded;
    }

    public final boolean getSpasiboBonuses() {
        return this.spasiboBonuses;
    }

    public final SPayStage getStage() {
        return this.stage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        boolean z13 = this.enableBnpl;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int iHashCode = (this.helperConfig.hashCode() + ((this.stage.hashCode() + (r13 * 31)) * 31)) * 31;
        boolean z14 = this.spasiboBonuses;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i13 = (iHashCode + r14) * 31;
        boolean z15 = this.resultViewNeeded;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int i14 = (i13 + r15) * 31;
        boolean z16 = this.enableLogging;
        ?? r16 = z16;
        if (z16) {
            r16 = 1;
        }
        int i15 = (i14 + r16) * 31;
        boolean z17 = this.enableOutsideTouchCancelling;
        return this.initializationResult.hashCode() + ((i15 + (z17 ? 1 : z17)) * 31);
    }

    public final SPaySdkInitConfigDto toSPaySdkInitConfigDto() {
        return new SPaySdkInitConfigDto(this.enableBnpl, this.stage.toString(), this.helperConfig, this.spasiboBonuses, this.resultViewNeeded, this.enableLogging, this.enableOutsideTouchCancelling);
    }

    public String toString() {
        return "SPaySdkInitConfig(enableBnpl=" + this.enableBnpl + ", stage=" + this.stage + ", helperConfig=" + this.helperConfig + ", spasiboBonuses=" + this.spasiboBonuses + ", resultViewNeeded=" + this.resultViewNeeded + ", enableLogging=" + this.enableLogging + ", enableOutsideTouchCancelling=" + this.enableOutsideTouchCancelling + ", initializationResult=" + this.initializationResult + ")";
    }

    public /* synthetic */ SPaySdkInitConfig(boolean z13, SPayStage sPayStage, SPayHelperConfig sPayHelperConfig, boolean z14, boolean z15, boolean z16, boolean z17, draadjrbmk draadjrbmkVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, sPayStage, (i13 & 4) != 0 ? new SPayHelperConfig(true, jyumaefscl.wflxmlrfwp()) : sPayHelperConfig, (i13 & 8) != 0 ? true : z14, (i13 & 16) != 0 ? true : z15, (i13 & 32) != 0 ? true : z16, (i13 & 64) != 0 ? true : z17, draadjrbmkVar);
    }
}
