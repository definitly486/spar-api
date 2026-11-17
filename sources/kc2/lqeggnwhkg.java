package kc2;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public enum lqeggnwhkg {
    UnknownSources(null, true, Integer.class, null),
    DeveloperTools(null, true, Integer.class, null),
    HoursSinceInstall(null, false, oc2.iobyxmoadg.class, null),
    Default(HoursSinceInstall, false, oc2.iobyxmoadg.class, null),
    Custom(HoursSinceInstall, false, oc2.iobyxmoadg.class, null),
    GooglePlayProtect(null, true, Integer.class, null),
    Emulator(null, true, Integer.class, null),
    TIMESTAMP(null, true, String.class, null),
    HardwareID(null, false, String.class, null),
    SIM_ID(null, false, String.class, null),
    PhoneNumber(null, false, String.class, null),
    PhoneNumbers(null, false, oc2.iobyxmoadg.class, null),
    DeviceModel(null, true, String.class, null),
    DeviceSystemName(null, true, String.class, null),
    DeviceSystemVersion(null, true, String.class, null),
    Languages(null, true, String.class, null),
    WiFiMacAddress(null, true, String.class, null),
    WiFiNetworksData(null, false, oc2.iobyxmoadg.class, null),
    BSSID(WiFiNetworksData, false, String.class, null),
    SignalStrength(WiFiNetworksData, false, String.class, null),
    Channel(WiFiNetworksData, true, String.class, null),
    SSID(WiFiNetworksData, false, String.class, null),
    CellTowerId(null, false, String.class, null),
    CellIdentities(null, false, oc2.ppxfxbqfkf.class, null),
    LocationAreaCode(null, false, String.class, null),
    ScreenSize(null, true, String.class, null),
    DisplayMetrics(null, false, oc2.iobyxmoadg.class, null),
    Density(DisplayMetrics, false, String.class, "cachingDensity"),
    DensityDpi(DisplayMetrics, false, String.class, "cachingDensityDpi"),
    ScaledDensity(DisplayMetrics, false, String.class, "cachingScaledDensity"),
    MCC(null, false, String.class, null),
    MNC(null, false, String.class, null),
    AppKey(null, true, String.class, "uniqueID"),
    SDK_VERSION(null, true, String.class, null),
    Compromised(null, true, Integer.class, null),
    MultitaskingSupported(null, true, Boolean.class, null),
    AdvertiserId(null, false, String.class, "adsId"),
    AppSetIdScopeApp(null, false, String.class, "appSetIdScopeApp"),
    AppSetIdScopeDeveloper(null, false, String.class, "appSetIdScopeDeveloper"),
    OS_ID(null, false, String.class, null),
    GeoLocationInfo(null, true, oc2.ppxfxbqfkf.class, "cachingGeoLocationTimeName"),
    Longitude(GeoLocationInfo, true, String.class, "cachingLongitude"),
    Latitude(GeoLocationInfo, true, String.class, "cachingLatitude"),
    GeoProvider(GeoLocationInfo, true, String.class, "cachingGeoProvider"),
    HorizontalAccuracy(GeoLocationInfo, true, String.class, "cachingHorizontalAccuracy"),
    Altitude(GeoLocationInfo, true, String.class, "cachingAltitude"),
    AltitudeAccuracy(GeoLocationInfo, true, String.class, "cachingVerticalAccuracy"),
    Heading(GeoLocationInfo, true, String.class, "cachingHeading"),
    Speed(GeoLocationInfo, true, String.class, "cachingSpeed"),
    Status(GeoLocationInfo, true, String.class, null),
    Timestamp(GeoLocationInfo, true, String.class, "cachingTimeStamp"),
    RSA_ApplicationKey(null, false, String.class, null),
    AgentBrand(null, true, String.class, null),
    AgentBootTime(null, true, String.class, null),
    TimeZone(null, true, String.class, null),
    SupportedAPILevel(null, true, String.class, null),
    OSCodeName(null, true, String.class, null),
    AgentAppInfo(null, true, String.class, null),
    OSFontsNumber(null, true, String.class, null),
    OSFontsHash(null, true, Integer.class, null),
    ScreenColorDepth(null, true, String.class, null),
    TimeZoneDSTOffset(null, true, String.class, null),
    SimCard(null, true, String.class, null),
    AgentSignalStrengthCellular(null, true, String.class, null),
    AgentConnectionType(null, false, String.class, null),
    AgentSignalTypeCellular(null, true, String.class, null),
    LocalIPv4(null, false, String.class, null),
    LocalIPv6(null, false, String.class, null),
    DnsIP(null, true, String.class, null),
    RdpConnection(null, true, String.class, null),
    RdpConnectionDuration(null, true, Integer.class, null),
    LocationHash(null, true, String.class, null),
    ApplicationMD5(null, false, String.class, null),
    InstallationSource(null, false, String.class, null),
    PhoneCallState(null, true, Integer.class, null),
    PhoneCallDirection(null, true, Integer.class, null),
    PhoneLastCall(null, false, oc2.iobyxmoadg.class, null),
    GoogleServicesParameters(null, false, oc2.iobyxmoadg.class, null),
    GoogleServicesDeviceId(GoogleServicesParameters, false, String.class, null),
    AccessibilityServices(null, false, oc2.iobyxmoadg.class, null),
    AuthenticationInfo(null, false, oc2.iobyxmoadg.class, null),
    ShareScreen(null, false, Boolean.class, null),
    ShareScreenInfo(null, false, oc2.iobyxmoadg.class, null),
    Debugger(null, true, Integer.class, null),
    VpnConnection(null, false, Boolean.class, null),
    VpnApps(null, false, String.class, null),
    BootId(null, false, String.class, null),
    BootCount(null, false, Integer.class, null),
    BuildData(null, false, oc2.iobyxmoadg.class, null),
    BOARD(BuildData, false, String.class, "cachingBOARD"),
    BOOTLOADER(BuildData, false, String.class, "cachingBOOTLOADER"),
    BRAND(BuildData, false, String.class, "cachingBRAND"),
    DEVICE(BuildData, false, String.class, "cachingDEVICE"),
    DISPLAY(BuildData, false, String.class, "cachingDISPLAY"),
    FINGERPRINT(BuildData, false, String.class, "cachingFINGERPRINT"),
    HARDWARE(BuildData, false, String.class, "cachingHARDWARE"),
    ID(BuildData, false, String.class, "cachingID"),
    MANUFACTURER(BuildData, false, String.class, "cachingMANUFACTURER"),
    PRODUCT(BuildData, false, String.class, "cachingPRODUCT"),
    RADIO(BuildData, false, String.class, "cachingRADIO"),
    PackageManager(null, false, Serializable.class, null),
    SystemAvailableFeatures(PackageManager, false, List.class, "cachingSystemAvailableFeatures"),
    SystemSharedLibraryNames(PackageManager, false, List.class, "cachingSystemSharedLibraryNames"),
    FileSystemInfo(null, false, oc2.iobyxmoadg.class, null),
    RootBytes(FileSystemInfo, false, String.class, "cachingRootBytes"),
    DataBytes(FileSystemInfo, false, String.class, "cachingDataBytes"),
    ExStorageBytes(FileSystemInfo, false, String.class, "cachingExStorageBytes"),
    PhoneInfo(null, false, oc2.iobyxmoadg.class, null),
    IMEI(PhoneInfo, false, String.class, "cachingIMEI"),
    IMSI(PhoneInfo, false, String.class, "cachingIMSI"),
    SIM(PhoneInfo, false, String.class, "cachingSIM"),
    PhoneESimInfo(null, true, oc2.iobyxmoadg.class, null),
    UnsafeInstall(null, false, oc2.iobyxmoadg.class, null),
    CameraUse(null, false, Boolean.class, null),
    ScreenshotCounter(null, false, Integer.class, null),
    GoogleID(null, false, String.class, null);

    public static final Class[] O = {Serializable.class, Integer.class, String.class, Boolean.class, List.class, oc2.iobyxmoadg.class, oc2.ppxfxbqfkf.class};

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final lqeggnwhkg f54561iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f54562jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final boolean f54563yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Class f54564zdlpuopuiu;

    public static class iobyxmoadg implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(lqeggnwhkg lqeggnwhkgVar, lqeggnwhkg lqeggnwhkgVar2) {
            return Integer.compare(lqeggnwhkgVar.ordinal(), lqeggnwhkgVar2.ordinal());
        }
    }

    lqeggnwhkg(lqeggnwhkg lqeggnwhkgVar, boolean z13, Class cls, String str) {
        this.f54561iwizpuwonk = lqeggnwhkgVar;
        this.f54563yggfygwlhe = z13;
        this.f54564zdlpuopuiu = cls;
        this.f54562jyumaefscl = str;
    }

    public static HashMap iobyxmoadg() {
        HashMap map = new HashMap();
        map.put("com.teamviewer.quicksupport.market", "QS");
        map.put("com.anydesk.anydeskandroid", "AnyDesk");
        map.put("us.zoom.videomeetings", "Zoom");
        map.put("com.discord", "Discord");
        map.put("com.awesun.control", "AwerayRemote");
        map.put("com.awesun.control.service", "AweSunClient");
        map.put("com.sand.airdroid", "Airdroid");
        map.put("com.sand.aircast", "Aircast");
        map.put("com.sand.airsos", "AirdroidRemoteSupport");
        map.put("com.sand.airdroidbizc", "AirdroidBusiness");
        map.put("ru.yandex.telemost", "YandexTelemost");
        map.put("com.sand.airmirror", "Airmirror");
        map.put("ru.nspk.mirpay", "MirPayS");
        map.put("ru.nspk.sbpay", "SbpPayS");
        map.put("com.carriez.flutter_hbb", "RustDeskRD");
        map.put("com.logmein.ignitionpro.android", "LogMein");
        map.put("com.islonline.isllight.mobile.android", "ISLLight");
        map.put("com.apowersoft.mirror", "APowerMirror");
        map.put("com.ve.devicemanager.devicemanager", "DeviceManager");
        map.put("getscreen.agent", "GetScreen");
        map.put("com.skype.raider", "Skype");
        map.put("com.webkey", "WebKey");
        map.put("ru.desktop.flutter_hbb", "RuDesktop");
        map.put("ru.safib.assistant", "Assistant");
        map.put("ru.rostel", "Gosuslugi");
        map.put("de.im.RemoDroid", "RemoDroid");
        map.put("com.koushikdutta.vysor", "Vysor");
        map.put("com.google.chromeremotedesktop", "ChromeRD");
        map.put("com.realvnc.viewer.android", "RealVncV");
        map.put("it.nanosystems.Supremo", "Supremo");
        map.put("com.embarcadero.LiteManager", "LiteManager");
        map.put("ru.rmansys.mviewer", "RMS");
        map.put("com.nomachine.nxplayer", "NoMachine");
        map.put("com.zoho.assist", "ZohoAssist");
        map.put("com.bomgar.thinclient.android", "BeyondTrust");
        map.put("com.logmein.rescuemobile", "Rescue");
        return map;
    }

    public boolean dxjokdxxww() {
        return this.f54563yggfygwlhe;
    }

    public lqeggnwhkg lqeggnwhkg() {
        return this.f54561iwizpuwonk;
    }

    public Class nufgyqmvbu() {
        return this.f54564zdlpuopuiu;
    }

    public String wkgbmnqykc() {
        String str = this.f54562jyumaefscl;
        if (str != null) {
            return str;
        }
        return "fp_" + name();
    }
}
