package spay.sdk.data.dto;

import gg.wwaezpbzkn;
import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.api.InitializationResult;
import spay.sdk.api.SPayHelperConfig;
import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.api.SPayStage;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0006\u0010#\u001a\u00020$J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\f\u0010&\u001a\u00020'*\u00020\u0005H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, d2 = {"Lspay/sdk/data/dto/SPaySdkInitConfigDto;", "", "enableBnpl", "", "stage", "", "helperConfig", "Lspay/sdk/api/SPayHelperConfig;", "spasiboBonuses", "resultViewNeeded", "enableLogging", "enableOutsideTouchCancelling", "(ZLjava/lang/String;Lspay/sdk/api/SPayHelperConfig;ZZZZ)V", "getEnableBnpl", "()Z", "getEnableLogging", "getEnableOutsideTouchCancelling", "getHelperConfig", "()Lspay/sdk/api/SPayHelperConfig;", "getResultViewNeeded", "getSpasiboBonuses", "getStage", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toSPaySdkInitConfig", "Lspay/sdk/api/SPaySdkInitConfig;", "toString", "toSPayStage", "Lspay/sdk/api/SPayStage;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SPaySdkInitConfigDto {
    private final boolean enableBnpl;
    private final boolean enableLogging;
    private final boolean enableOutsideTouchCancelling;
    private final SPayHelperConfig helperConfig;
    private final boolean resultViewNeeded;
    private final boolean spasiboBonuses;
    private final String stage;

    /* JADX INFO: renamed from: spay.sdk.data.dto.SPaySdkInitConfigDto$toSPaySdkInitConfig$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lspay/sdk/api/InitializationResult;", "it", "Lgg/wwaezpbzkn;", "invoke", "(Lspay/sdk/api/InitializationResult;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends jyumaefscl implements draadjrbmk {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(InitializationResult it) {
            zdlpuopuiu.btonecajqb(it, "it");
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InitializationResult) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public SPaySdkInitConfigDto(boolean z13, String stage, SPayHelperConfig helperConfig, boolean z14, boolean z15, boolean z16, boolean z17) {
        zdlpuopuiu.btonecajqb(stage, "stage");
        zdlpuopuiu.btonecajqb(helperConfig, "helperConfig");
        this.enableBnpl = z13;
        this.stage = stage;
        this.helperConfig = helperConfig;
        this.spasiboBonuses = z14;
        this.resultViewNeeded = z15;
        this.enableLogging = z16;
        this.enableOutsideTouchCancelling = z17;
    }

    public static /* synthetic */ SPaySdkInitConfigDto copy$default(SPaySdkInitConfigDto sPaySdkInitConfigDto, boolean z13, String str, SPayHelperConfig sPayHelperConfig, boolean z14, boolean z15, boolean z16, boolean z17, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = sPaySdkInitConfigDto.enableBnpl;
        }
        if ((i13 & 2) != 0) {
            str = sPaySdkInitConfigDto.stage;
        }
        String str2 = str;
        if ((i13 & 4) != 0) {
            sPayHelperConfig = sPaySdkInitConfigDto.helperConfig;
        }
        SPayHelperConfig sPayHelperConfig2 = sPayHelperConfig;
        if ((i13 & 8) != 0) {
            z14 = sPaySdkInitConfigDto.spasiboBonuses;
        }
        boolean z18 = z14;
        if ((i13 & 16) != 0) {
            z15 = sPaySdkInitConfigDto.resultViewNeeded;
        }
        boolean z19 = z15;
        if ((i13 & 32) != 0) {
            z16 = sPaySdkInitConfigDto.enableLogging;
        }
        boolean z23 = z16;
        if ((i13 & 64) != 0) {
            z17 = sPaySdkInitConfigDto.enableOutsideTouchCancelling;
        }
        return sPaySdkInitConfigDto.copy(z13, str2, sPayHelperConfig2, z18, z19, z23, z17);
    }

    private final SPayStage toSPayStage(String str) {
        SPayStage sPayStage = SPayStage.SandBoxWithoutBankApp;
        if (zdlpuopuiu.eablkybsjg(str, sPayStage.toString())) {
            return sPayStage;
        }
        SPayStage sPayStage2 = SPayStage.SandboxRealBankApp;
        return zdlpuopuiu.eablkybsjg(str, sPayStage2.toString()) ? sPayStage2 : SPayStage.Prod;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnableBnpl() {
        return this.enableBnpl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStage() {
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

    public final SPaySdkInitConfigDto copy(boolean enableBnpl, String stage, SPayHelperConfig helperConfig, boolean spasiboBonuses, boolean resultViewNeeded, boolean enableLogging, boolean enableOutsideTouchCancelling) {
        zdlpuopuiu.btonecajqb(stage, "stage");
        zdlpuopuiu.btonecajqb(helperConfig, "helperConfig");
        return new SPaySdkInitConfigDto(enableBnpl, stage, helperConfig, spasiboBonuses, resultViewNeeded, enableLogging, enableOutsideTouchCancelling);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPaySdkInitConfigDto)) {
            return false;
        }
        SPaySdkInitConfigDto sPaySdkInitConfigDto = (SPaySdkInitConfigDto) other;
        return this.enableBnpl == sPaySdkInitConfigDto.enableBnpl && zdlpuopuiu.eablkybsjg(this.stage, sPaySdkInitConfigDto.stage) && zdlpuopuiu.eablkybsjg(this.helperConfig, sPaySdkInitConfigDto.helperConfig) && this.spasiboBonuses == sPaySdkInitConfigDto.spasiboBonuses && this.resultViewNeeded == sPaySdkInitConfigDto.resultViewNeeded && this.enableLogging == sPaySdkInitConfigDto.enableLogging && this.enableOutsideTouchCancelling == sPaySdkInitConfigDto.enableOutsideTouchCancelling;
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

    public final boolean getResultViewNeeded() {
        return this.resultViewNeeded;
    }

    public final boolean getSpasiboBonuses() {
        return this.spasiboBonuses;
    }

    public final String getStage() {
        return this.stage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    public int hashCode() {
        boolean z13 = this.enableBnpl;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int iHashCode = (this.helperConfig.hashCode() + xg.iobyxmoadg(this.stage, r13 * 31, 31)) * 31;
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
        return i15 + (z17 ? 1 : z17);
    }

    public final SPaySdkInitConfig toSPaySdkInitConfig() {
        return new SPaySdkInitConfig(this.enableBnpl, toSPayStage(this.stage), this.helperConfig, this.spasiboBonuses, this.resultViewNeeded, this.enableLogging, this.enableOutsideTouchCancelling, AnonymousClass1.INSTANCE);
    }

    public String toString() {
        return "SPaySdkInitConfigDto(enableBnpl=" + this.enableBnpl + ", stage=" + this.stage + ", helperConfig=" + this.helperConfig + ", spasiboBonuses=" + this.spasiboBonuses + ", resultViewNeeded=" + this.resultViewNeeded + ", enableLogging=" + this.enableLogging + ", enableOutsideTouchCancelling=" + this.enableOutsideTouchCancelling + ")";
    }

    public /* synthetic */ SPaySdkInitConfigDto(boolean z13, String str, SPayHelperConfig sPayHelperConfig, boolean z14, boolean z15, boolean z16, boolean z17, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, str, (i13 & 4) != 0 ? new SPayHelperConfig(true, hg.jyumaefscl.wflxmlrfwp()) : sPayHelperConfig, (i13 & 8) != 0 ? true : z14, (i13 & 16) != 0 ? true : z15, (i13 & 32) != 0 ? true : z16, (i13 & 64) != 0 ? true : z17);
    }
}
