package e6;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final e6.iobyxmoadg.zoijcleaow f30545iobyxmoadg = new e6.iobyxmoadg.zoijcleaow("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final e6.iobyxmoadg.zoijcleaow f30587zoijcleaow = new e6.iobyxmoadg.zoijcleaow("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final e6.iobyxmoadg.eablkybsjg f30568ppxfxbqfkf = new e6.iobyxmoadg.eablkybsjg("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final e6.iobyxmoadg.ppxfxbqfkf f30579wkgbmnqykc = new e6.iobyxmoadg.ppxfxbqfkf("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final e6.iobyxmoadg.gxszxtbevo f30538eablkybsjg = new e6.iobyxmoadg.gxszxtbevo("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final e6.iobyxmoadg.gxszxtbevo f30541gxszxtbevo = new e6.iobyxmoadg.gxszxtbevo("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final e6.iobyxmoadg.gxszxtbevo f30558lqeggnwhkg = new e6.iobyxmoadg.gxszxtbevo("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final e6.iobyxmoadg.gxszxtbevo f30562nufgyqmvbu = new e6.iobyxmoadg.gxszxtbevo("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final e6.iobyxmoadg.gxszxtbevo f30537dxjokdxxww = new e6.iobyxmoadg.gxszxtbevo("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final e6.iobyxmoadg.gxszxtbevo f30529btonecajqb = new e6.iobyxmoadg.gxszxtbevo("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final e6.iobyxmoadg.ppxfxbqfkf f30540gtknphoqwx = new e6.iobyxmoadg.ppxfxbqfkf("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public static final e6.iobyxmoadg.ppxfxbqfkf f30535draadjrbmk = new e6.iobyxmoadg.ppxfxbqfkf("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public static final e6.iobyxmoadg.ppxfxbqfkf f30578wflxmlrfwp = new e6.iobyxmoadg.ppxfxbqfkf("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public static final e6.iobyxmoadg.ppxfxbqfkf f30528agtfadlqog = new e6.iobyxmoadg.ppxfxbqfkf("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final e6.iobyxmoadg.ppxfxbqfkf f30563ojitshcjhn = new e6.iobyxmoadg.ppxfxbqfkf("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public static final e6.iobyxmoadg.ppxfxbqfkf f30569rgvfuqvkyq = new e6.iobyxmoadg.ppxfxbqfkf("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public static final e6.iobyxmoadg.zoijcleaow f30576vdvldrhtss = new e6.iobyxmoadg.zoijcleaow("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public static final e6.iobyxmoadg.zoijcleaow f30565oxmwwwfdhm = new e6.iobyxmoadg.zoijcleaow("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public static final e6.iobyxmoadg.ppxfxbqfkf f30554kcexrzcfyt = new e6.iobyxmoadg.ppxfxbqfkf("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final e6.iobyxmoadg.gxszxtbevo f30586zdlpuopuiu = new e6.iobyxmoadg.gxszxtbevo("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final e6.iobyxmoadg.ppxfxbqfkf f30584yggfygwlhe = new e6.iobyxmoadg.ppxfxbqfkf("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final e6.iobyxmoadg.zoijcleaow f30552jyumaefscl = new e6.iobyxmoadg.zoijcleaow("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final e6.iobyxmoadg.zoijcleaow f30548iwizpuwonk = new e6.iobyxmoadg.zoijcleaow("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final e6.iobyxmoadg.gxszxtbevo f30532cqumvgiudr = new e6.iobyxmoadg.gxszxtbevo("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final e6.iobyxmoadg.gxszxtbevo f30539esjtqupxsv = new e6.iobyxmoadg.gxszxtbevo("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final e6.iobyxmoadg.gxszxtbevo f30556lereixgezr = new e6.iobyxmoadg.gxszxtbevo("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final e6.iobyxmoadg.zoijcleaow f30567pmvmpeiblj = new e6.iobyxmoadg.zoijcleaow("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final e6.iobyxmoadg.zoijcleaow f30588zynmafqrjb = new e6.iobyxmoadg.zoijcleaow("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30547istkbnxepw = new e6.iobyxmoadg.wkgbmnqykc("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final e6.iobyxmoadg.zoijcleaow f30530cdpycssgdh = new e6.iobyxmoadg.zoijcleaow("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final e6.iobyxmoadg.zoijcleaow f30583yadqdtsiqt = new e6.iobyxmoadg.zoijcleaow("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final e6.iobyxmoadg.zoijcleaow f30546iozdgvuglv = new e6.iobyxmoadg.zoijcleaow("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static final e6.iobyxmoadg.zoijcleaow f30557lmojexxdyd = new e6.iobyxmoadg.zoijcleaow("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    public static final e6.iobyxmoadg.eablkybsjg f30580wwaezpbzkn = new e6.iobyxmoadg.eablkybsjg("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    public static final e6.iobyxmoadg.eablkybsjg f30585ylkuphrtab = new e6.iobyxmoadg.eablkybsjg("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    public static final e6.iobyxmoadg.nufgyqmvbu f30566pkzmftpjix = new e6.iobyxmoadg.nufgyqmvbu("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    public static final e6.iobyxmoadg.nufgyqmvbu f30542hcddaimhww = new e6.iobyxmoadg.nufgyqmvbu("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    public static final e6.iobyxmoadg.lqeggnwhkg f30551jpowsppfya = new e6.iobyxmoadg.lqeggnwhkg("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    public static final dxjokdxxww.zoijcleaow f30543hkdspvbjdz = new dxjokdxxww.zoijcleaow("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    public static final dxjokdxxww.iobyxmoadg f30531cllcsxoeiz = new dxjokdxxww.iobyxmoadg("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    public static final e6.iobyxmoadg.nufgyqmvbu f30536dsvhmnatus = new e6.iobyxmoadg.nufgyqmvbu("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    public static final e6.iobyxmoadg.dxjokdxxww f30581wypolnanlu = new iobyxmoadg("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30573stevsuqkhv = new e6.iobyxmoadg.wkgbmnqykc("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30555kegysxyocb = new e6.iobyxmoadg.wkgbmnqykc("MULTI_PROCESS", "MULTI_PROCESS_QUERY");

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    public static final e6.iobyxmoadg.nufgyqmvbu f30574tzroggbefp = new e6.iobyxmoadg.nufgyqmvbu("FORCE_DARK", "FORCE_DARK");

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30559mbcevpiqjq = new e6.iobyxmoadg.wkgbmnqykc("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30561ntlheqmsrt = new e6.iobyxmoadg.wkgbmnqykc("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30575ulzqkzuiru = new e6.iobyxmoadg.wkgbmnqykc("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30572sopmlzcsov = new e6.iobyxmoadg.wkgbmnqykc("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30533crxdokpmqz = new e6.iobyxmoadg.wkgbmnqykc("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30550jlmebxxoox = new e6.iobyxmoadg.wkgbmnqykc("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30570ribwqtqdhb = new e6.iobyxmoadg.wkgbmnqykc("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30577vipkmwdibw = new e6.iobyxmoadg.wkgbmnqykc("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30549jhduphickx = new e6.iobyxmoadg.wkgbmnqykc("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30544ikoacuggdj = new zoijcleaow("MULTI_PROFILE", "MULTI_PROFILE");

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30564okpsazkaxt = new e6.iobyxmoadg.wkgbmnqykc("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30553jztzpxfvev = new e6.iobyxmoadg.wkgbmnqykc("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30582xrmfcynszj = new e6.iobyxmoadg.wkgbmnqykc("MUTE_AUDIO", "MUTE_AUDIO");

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30560metgxyhuhe = new e6.iobyxmoadg.wkgbmnqykc("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30571rlfsiqarku = new e6.iobyxmoadg.wkgbmnqykc("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    public static final e6.iobyxmoadg.wkgbmnqykc f30534czzsidtyhn = new e6.iobyxmoadg.wkgbmnqykc("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");

    class iobyxmoadg extends e6.iobyxmoadg.dxjokdxxww {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Pattern f30589wkgbmnqykc;

        iobyxmoadg(String str, String str2) {
            super(str, str2);
            this.f30589wkgbmnqykc = Pattern.compile("\\A\\d+");
        }

        @Override // e6.iobyxmoadg
        public boolean wkgbmnqykc() {
            boolean zWkgbmnqykc = super.wkgbmnqykc();
            if (!zWkgbmnqykc || Build.VERSION.SDK_INT >= 29) {
                return zWkgbmnqykc;
            }
            PackageInfo packageInfoIobyxmoadg = d6.zoijcleaow.iobyxmoadg();
            if (packageInfoIobyxmoadg == null) {
                return false;
            }
            Matcher matcher = this.f30589wkgbmnqykc.matcher(packageInfoIobyxmoadg.versionName);
            return matcher.find() && Integer.parseInt(packageInfoIobyxmoadg.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    class zoijcleaow extends e6.iobyxmoadg.wkgbmnqykc {
        zoijcleaow(String str, String str2) {
            super(str, str2);
        }

        @Override // e6.iobyxmoadg
        public boolean wkgbmnqykc() {
            if (super.wkgbmnqykc() && d6.ppxfxbqfkf.iobyxmoadg("MULTI_PROCESS")) {
                return d6.zoijcleaow.ppxfxbqfkf();
            }
            return false;
        }
    }

    public static UnsupportedOperationException iobyxmoadg() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean ppxfxbqfkf(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) it.next();
            if (lqeggnwhkgVar.zoijcleaow().equals(str)) {
                hashSet.add(lqeggnwhkgVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (((lqeggnwhkg) it2.next()).iobyxmoadg()) {
                return true;
            }
        }
        return false;
    }

    public static boolean zoijcleaow(String str) {
        return ppxfxbqfkf(str, e6.iobyxmoadg.eablkybsjg());
    }
}
