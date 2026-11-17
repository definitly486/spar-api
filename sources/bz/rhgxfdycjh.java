package bz;

import android.content.Context;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.impl.C4007z9;
import java.util.Objects;
import java.util.Set;
import t6.g1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rhgxfdycjh {

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f17581iobyxmoadg;

        static {
            int[] iArr = new int[kc2.lqeggnwhkg.values().length];
            f17581iobyxmoadg = iArr;
            try {
                iArr[kc2.lqeggnwhkg.BuildData.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.PackageManager.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.DeveloperTools.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.UnknownSources.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.HoursSinceInstall.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.GooglePlayProtect.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.Emulator.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.TIMESTAMP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.HardwareID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.SIM_ID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.PhoneNumber.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.PhoneNumbers.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.DeviceModel.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.DeviceSystemName.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.DeviceSystemVersion.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.Languages.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.WiFiMacAddress.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.WiFiNetworksData.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.CellTowerId.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.CellIdentities.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.LocationAreaCode.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.ScreenSize.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.DisplayMetrics.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.MCC.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.MNC.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.AppKey.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.SDK_VERSION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.Compromised.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.MultitaskingSupported.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.AdvertiserId.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.AppSetIdScopeApp.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.AppSetIdScopeDeveloper.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.OS_ID.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.GeoLocationInfo.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.RSA_ApplicationKey.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.AgentBrand.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.AgentBootTime.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.TimeZone.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.SupportedAPILevel.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.OSCodeName.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.AgentAppInfo.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.OSFontsNumber.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.OSFontsHash.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.ScreenColorDepth.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.TimeZoneDSTOffset.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.SimCard.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.AgentSignalStrengthCellular.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.AgentConnectionType.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.AgentSignalTypeCellular.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.LocalIPv4.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.LocalIPv6.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.DnsIP.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.RdpConnection.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.RdpConnectionDuration.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.LocationHash.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.ApplicationMD5.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.InstallationSource.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.PhoneCallState.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.PhoneCallDirection.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.PhoneLastCall.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.GoogleServicesParameters.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.AccessibilityServices.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.AuthenticationInfo.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.ShareScreen.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.ShareScreenInfo.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.Debugger.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.VpnConnection.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.VpnApps.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.BootId.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.BootCount.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.FileSystemInfo.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.PhoneInfo.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.PhoneESimInfo.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.CameraUse.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.UnsafeInstall.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.ScreenshotCounter.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f17581iobyxmoadg[kc2.lqeggnwhkg.GoogleID.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
        }
    }

    public static metgxyhuhe iobyxmoadg(Set set, kc2.lqeggnwhkg lqeggnwhkgVar, Context context, pc2.iobyxmoadg iobyxmoadgVar, t6.h0 h0Var, t6.hcddaimhww hcddaimhwwVar, kc2.wkgbmnqykc wkgbmnqykcVar, boolean z13) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        Objects.requireNonNull(audioManager);
        TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
        h0 h0Var2 = new h0(context);
        t6.yfnezrywwk yfnezrywwkVar = new t6.yfnezrywwk(context, t6.iwxlajgraz.zoijcleaow());
        t6.zfvoamnweg zfvoamnwegVar = new t6.zfvoamnweg(context);
        t6.ribwqtqdhb ribwqtqdhbVar = t6.ribwqtqdhb.GLOBAL_RAM;
        t6.zdlpuopuiu zdlpuopuiuVarIobyxmoadg = t6.dxjokdxxww.iobyxmoadg(ribwqtqdhbVar, context);
        t6.zdlpuopuiu zdlpuopuiuVarIobyxmoadg2 = t6.dxjokdxxww.iobyxmoadg(t6.ribwqtqdhb.GLOBAL_SHARED_PREFERENCES, context);
        t6.yadqdtsiqt yadqdtsiqtVarZoijcleaow = g1.zoijcleaow(context);
        switch (iobyxmoadg.f17581iobyxmoadg[lqeggnwhkgVar.ordinal()]) {
            case 1:
                return new bfopjjpdmp(set);
            case 2:
                return new fiwbwshyhd(iobyxmoadgVar, context);
            case 3:
                return new fmlbqenlif(context);
            case 4:
                return new l(context);
            case 5:
                return new auzgnhcxok(context, iobyxmoadgVar);
            case 6:
                return new xrmfcynszj(context, zdlpuopuiuVarIobyxmoadg);
            case 7:
                return new cdpycssgdh(context, zdlpuopuiuVarIobyxmoadg, telephonyManager, iobyxmoadgVar);
            case 8:
                return new g();
            case 9:
                return new zeieaojujs(context, telephonyManager);
            case 10:
                return new istkbnxepw(context, telephonyManager);
            case 11:
                return new wwaezpbzkn(context, telephonyManager);
            case 12:
                return new tzroggbefp(context);
            case 13:
                return new eslsurpljm();
            case 14:
                return new d();
            case 15:
                return new h();
            case 16:
                return new ezmngbhpjk();
            case 17:
                return new g0(context);
            case 18:
                return new j0(set, new i(context, wifiManager), new m0(wifiManager), new weqkydbzbr(wifiManager), new mbcevpiqjq(wifiManager));
            case 19:
                return new ulzqkzuiru(context, zdlpuopuiuVarIobyxmoadg, yadqdtsiqtVarZoijcleaow, hcddaimhwwVar);
            case 20:
                return new mhtqkkgtqm(context, zdlpuopuiuVarIobyxmoadg, yadqdtsiqtVarZoijcleaow, hcddaimhwwVar);
            case 21:
                return new u(context, telephonyManager);
            case 22:
                return new f(context);
            case 23:
                return new k0(set, context);
            case 24:
                return new zynmafqrjb(context, telephonyManager);
            case C4007z9.F /* 25 */:
                return new lmojexxdyd(context, telephonyManager);
            case C4007z9.G /* 26 */:
                return new grlcpdaxtj(zdlpuopuiuVarIobyxmoadg2);
            case 27:
                return new q();
            case 28:
                return new ribwqtqdhb(context, iobyxmoadgVar.eablkybsjg(), yfnezrywwkVar, zfvoamnwegVar, h0Var, hcddaimhwwVar);
            case C4007z9.I /* 29 */:
                return new kegysxyocb();
            case 30:
                return new kcexrzcfyt(context, zdlpuopuiuVarIobyxmoadg2);
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return new draadjrbmk(context, zdlpuopuiuVarIobyxmoadg2);
            case 32:
                return new ojitshcjhn(context, zdlpuopuiuVarIobyxmoadg2);
            case 33:
                return new iwxlajgraz(context);
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                return new iozdgvuglv(set, context, t6.dxjokdxxww.iobyxmoadg(ribwqtqdhbVar, context), wkgbmnqykcVar, locationManager, new l0(context, zdlpuopuiuVarIobyxmoadg2, locationManager, wkgbmnqykcVar), new krqnebusok(context, zdlpuopuiuVarIobyxmoadg2, locationManager, wkgbmnqykcVar), new stevsuqkhv(context, zdlpuopuiuVarIobyxmoadg2, locationManager, wkgbmnqykcVar), new pkzmftpjix(context, zdlpuopuiuVarIobyxmoadg2, locationManager, wkgbmnqykcVar), new dxjokdxxww(context, zdlpuopuiuVarIobyxmoadg2, locationManager, wkgbmnqykcVar), new gtknphoqwx(context, zdlpuopuiuVarIobyxmoadg2, locationManager, wkgbmnqykcVar), new tbqsvytpvh(context, zdlpuopuiuVarIobyxmoadg2, locationManager, wkgbmnqykcVar), new ylkuphrtab(context, zdlpuopuiuVarIobyxmoadg2, locationManager, wkgbmnqykcVar), new yfnezrywwk(context, locationManager), new sflfametgt(context, zdlpuopuiuVarIobyxmoadg2, locationManager, wkgbmnqykcVar));
            case C4007z9.J /* 35 */:
                return new ipoelvxyzq(context, z13);
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                return new btonecajqb();
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                return new bz.iobyxmoadg();
            case C4007z9.K /* 38 */:
                return new c();
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                return new uawqvzlxes();
            case 40:
                return new zfvoamnweg();
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                return new oxmwwwfdhm(context, iobyxmoadgVar);
            case 42:
                return new roivzttewh(zdlpuopuiuVarIobyxmoadg);
            case 43:
                return new nuxfzjnpeb(zdlpuopuiuVarIobyxmoadg);
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                return new b(context);
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                return new yzdjzghtvl();
            case 46:
                return new jyumaefscl(zdlpuopuiuVarIobyxmoadg, telephonyManager);
            case 47:
                return new lqeggnwhkg(context, zdlpuopuiuVarIobyxmoadg, yadqdtsiqtVarZoijcleaow, hcddaimhwwVar);
            case 48:
                return new zdlpuopuiu(connectivityManager);
            case 49:
                return new nufgyqmvbu(context, zdlpuopuiuVarIobyxmoadg, yadqdtsiqtVarZoijcleaow, hcddaimhwwVar);
            case 50:
                return new j();
            case 51:
                return new o();
            case 52:
                return new yggfygwlhe(connectivityManager);
            case 53:
                return new oipsdeybqn(context);
            case 54:
                return new ydmasvzmpa(new oipsdeybqn(context));
            case 55:
                return new w();
            case 56:
                return new agtfadlqog(context, zdlpuopuiuVarIobyxmoadg, iobyxmoadgVar);
            case 57:
                return new hszhottldk(context);
            case 58:
                return new v(context);
            case 59:
                return new p(context);
            case 60:
                return new i0(context, telecomManager, ntlheqmsrt.iobyxmoadg(context, audioManager, iobyxmoadgVar.draadjrbmk()), hcddaimhwwVar);
            case 61:
                return new czzsidtyhn(set, context, zdlpuopuiuVarIobyxmoadg);
            case 62:
                return new zoijcleaow(context);
            case 63:
                return new ikoacuggdj(context);
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                return new f0(h0Var2);
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                return new z(h0Var2);
            case 66:
                return new ageimvtcrz(context);
            case 67:
                return new a0(context);
            case 68:
                return new y(zfvoamnwegVar, zdlpuopuiuVarIobyxmoadg);
            case 69:
                return new n();
            case 70:
                return new t(context);
            case 71:
                return new ixidwrxhsl(set);
            case 72:
                return new e0(set, context);
            case 73:
                return new x(context);
            case 74:
                return new uwvvkdfqfp(context);
            case 75:
                return new s(context);
            case 76:
                try {
                    k.iozdgvuglv(context);
                    break;
                } catch (q2 unused) {
                }
                return new k();
            case 77:
                return new vipkmwdibw(context);
            default:
                throw new IllegalArgumentException("Not found provider for parameter type: " + lqeggnwhkgVar);
        }
    }
}
