package bz;

import android.net.wifi.WifiManager;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import modern.payments.ecomAndroid.data.repository.ThreeDSecureRepositoryImpl;

/* JADX INFO: loaded from: classes2.dex */
class weqkydbzbr extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final WifiManager f17657eablkybsjg;

    weqkydbzbr(WifiManager wifiManager) {
        super(kc2.lqeggnwhkg.Channel);
        this.f17657eablkybsjg = wifiManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() {
        WifiManager wifiManager = this.f17657eablkybsjg;
        switch (wifiManager != null ? wifiManager.getConnectionInfo().getFrequency() : 0) {
            case 2412:
                return "1";
            case 2417:
                return "2";
            case 2422:
                return "3";
            case 2427:
                return "4";
            case 2432:
                return ThreeDSecureRepositoryImpl.DEF_MAX_TIMEOUT;
            case 2437:
                return "6";
            case 2442:
                return "7";
            case 2447:
                return "8";
            case 2452:
                return "9";
            case 2457:
                return "10";
            case 2462:
                return "11";
            case 2467:
                return "12";
            case 2472:
                return "13";
            case 2484:
                return "14";
            case 5180:
                return "36";
            case 5190:
                return "38";
            case 5200:
                return "40";
            case 5210:
                return "42";
            case 5220:
                return "44";
            case 5230:
                return "46";
            case 5240:
                return "48";
            case 5260:
                return "52";
            case 5280:
                return "56";
            case 5300:
                return "60";
            case 5320:
                return "64";
            case 5500:
                return "100";
            case 5520:
                return "104";
            case 5540:
                return "108";
            case 5560:
                return "112";
            case 5580:
                return "116";
            case 5600:
                return "120";
            case 5620:
                return "124";
            case 5640:
                return "128";
            case 5660:
                return "132";
            case 5680:
                return "136";
            case 5700:
                return "140";
            case 5745:
                return "149";
            case 5765:
                return "153";
            case 5785:
                return "157";
            case 5805:
                return "161";
            case 5825:
                return "165";
            default:
                return CommonUrlParts.Values.FALSE_INTEGER;
        }
    }
}
