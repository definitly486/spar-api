package spay.sdk.data.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006!"}, d2 = {"Lspay/sdk/data/dto/StartDeviceInfoModel;", "", "compromised", "", "emulator", "rdpConnection", "accessibilityServices", "Lspay/sdk/data/dto/StartDeviceInfoModel$AccessibilityServices;", "rdpConnectionDuration", "debugger", "(IIILspay/sdk/data/dto/StartDeviceInfoModel$AccessibilityServices;II)V", "getAccessibilityServices", "()Lspay/sdk/data/dto/StartDeviceInfoModel$AccessibilityServices;", "getCompromised", "()I", "getDebugger", "getEmulator", "getRdpConnection", "getRdpConnectionDuration", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "AccessibilityServices", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StartDeviceInfoModel {

    @ppxfxbqfkf("AccessibilityServices")
    private final AccessibilityServices accessibilityServices;

    @ppxfxbqfkf("Compromised")
    private final int compromised;

    @ppxfxbqfkf("Debugger")
    private final int debugger;

    @ppxfxbqfkf("Emulator")
    private final int emulator;

    @ppxfxbqfkf("RdpConnection")
    private final int rdpConnection;

    @ppxfxbqfkf("RdpConnectionDuration")
    private final int rdpConnectionDuration;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lspay/sdk/data/dto/StartDeviceInfoModel$AccessibilityServices;", "", "enabled", "", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AccessibilityServices {

        @ppxfxbqfkf("enabled")
        private final boolean enabled;

        public AccessibilityServices(boolean z13) {
            this.enabled = z13;
        }

        public static /* synthetic */ AccessibilityServices copy$default(AccessibilityServices accessibilityServices, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z13 = accessibilityServices.enabled;
            }
            return accessibilityServices.copy(z13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final AccessibilityServices copy(boolean enabled) {
            return new AccessibilityServices(enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AccessibilityServices) && this.enabled == ((AccessibilityServices) other).enabled;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            boolean z13 = this.enabled;
            if (z13) {
                return 1;
            }
            return z13 ? 1 : 0;
        }

        public String toString() {
            return "AccessibilityServices(enabled=" + this.enabled + ")";
        }
    }

    public StartDeviceInfoModel(int i13, int i14, int i15, AccessibilityServices accessibilityServices, int i16, int i17) {
        zdlpuopuiu.btonecajqb(accessibilityServices, "accessibilityServices");
        this.compromised = i13;
        this.emulator = i14;
        this.rdpConnection = i15;
        this.accessibilityServices = accessibilityServices;
        this.rdpConnectionDuration = i16;
        this.debugger = i17;
    }

    public static /* synthetic */ StartDeviceInfoModel copy$default(StartDeviceInfoModel startDeviceInfoModel, int i13, int i14, int i15, AccessibilityServices accessibilityServices, int i16, int i17, int i18, Object obj) {
        if ((i18 & 1) != 0) {
            i13 = startDeviceInfoModel.compromised;
        }
        if ((i18 & 2) != 0) {
            i14 = startDeviceInfoModel.emulator;
        }
        int i19 = i14;
        if ((i18 & 4) != 0) {
            i15 = startDeviceInfoModel.rdpConnection;
        }
        int i23 = i15;
        if ((i18 & 8) != 0) {
            accessibilityServices = startDeviceInfoModel.accessibilityServices;
        }
        AccessibilityServices accessibilityServices2 = accessibilityServices;
        if ((i18 & 16) != 0) {
            i16 = startDeviceInfoModel.rdpConnectionDuration;
        }
        int i24 = i16;
        if ((i18 & 32) != 0) {
            i17 = startDeviceInfoModel.debugger;
        }
        return startDeviceInfoModel.copy(i13, i19, i23, accessibilityServices2, i24, i17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCompromised() {
        return this.compromised;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEmulator() {
        return this.emulator;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRdpConnection() {
        return this.rdpConnection;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AccessibilityServices getAccessibilityServices() {
        return this.accessibilityServices;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRdpConnectionDuration() {
        return this.rdpConnectionDuration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDebugger() {
        return this.debugger;
    }

    public final StartDeviceInfoModel copy(int compromised, int emulator, int rdpConnection, AccessibilityServices accessibilityServices, int rdpConnectionDuration, int debugger) {
        zdlpuopuiu.btonecajqb(accessibilityServices, "accessibilityServices");
        return new StartDeviceInfoModel(compromised, emulator, rdpConnection, accessibilityServices, rdpConnectionDuration, debugger);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartDeviceInfoModel)) {
            return false;
        }
        StartDeviceInfoModel startDeviceInfoModel = (StartDeviceInfoModel) other;
        return this.compromised == startDeviceInfoModel.compromised && this.emulator == startDeviceInfoModel.emulator && this.rdpConnection == startDeviceInfoModel.rdpConnection && zdlpuopuiu.eablkybsjg(this.accessibilityServices, startDeviceInfoModel.accessibilityServices) && this.rdpConnectionDuration == startDeviceInfoModel.rdpConnectionDuration && this.debugger == startDeviceInfoModel.debugger;
    }

    public final AccessibilityServices getAccessibilityServices() {
        return this.accessibilityServices;
    }

    public final int getCompromised() {
        return this.compromised;
    }

    public final int getDebugger() {
        return this.debugger;
    }

    public final int getEmulator() {
        return this.emulator;
    }

    public final int getRdpConnection() {
        return this.rdpConnection;
    }

    public final int getRdpConnectionDuration() {
        return this.rdpConnectionDuration;
    }

    public int hashCode() {
        return Integer.hashCode(this.debugger) + ((Integer.hashCode(this.rdpConnectionDuration) + ((this.accessibilityServices.hashCode() + ((Integer.hashCode(this.rdpConnection) + ((Integer.hashCode(this.emulator) + (Integer.hashCode(this.compromised) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "StartDeviceInfoModel(compromised=" + this.compromised + ", emulator=" + this.emulator + ", rdpConnection=" + this.rdpConnection + ", accessibilityServices=" + this.accessibilityServices + ", rdpConnectionDuration=" + this.rdpConnectionDuration + ", debugger=" + this.debugger + ")";
    }
}
