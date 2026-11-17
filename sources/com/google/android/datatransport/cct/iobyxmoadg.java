package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import q9.lqeggnwhkg;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final String f21801eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final Set f21802gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final iobyxmoadg f21803lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final iobyxmoadg f21804nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final String f21805ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    static final String f21806wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f21807iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f21808zoijcleaow;

    static {
        String strIobyxmoadg = eablkybsjg.iobyxmoadg("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f21805ppxfxbqfkf = strIobyxmoadg;
        String strIobyxmoadg2 = eablkybsjg.iobyxmoadg("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f21806wkgbmnqykc = strIobyxmoadg2;
        String strIobyxmoadg3 = eablkybsjg.iobyxmoadg("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f21801eablkybsjg = strIobyxmoadg3;
        f21802gxszxtbevo = Collections.unmodifiableSet(new HashSet(Arrays.asList(o9.ppxfxbqfkf.zoijcleaow("proto"), o9.ppxfxbqfkf.zoijcleaow("json"))));
        f21803lqeggnwhkg = new iobyxmoadg(strIobyxmoadg, null);
        f21804nufgyqmvbu = new iobyxmoadg(strIobyxmoadg2, strIobyxmoadg3);
    }

    public iobyxmoadg(String str, String str2) {
        this.f21807iobyxmoadg = str;
        this.f21808zoijcleaow = str2;
    }

    public static iobyxmoadg ppxfxbqfkf(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new iobyxmoadg(str2, str3);
    }

    public String eablkybsjg() {
        return this.f21807iobyxmoadg;
    }

    @Override // q9.gxszxtbevo
    public byte[] getExtras() {
        return zoijcleaow();
    }

    @Override // q9.gxszxtbevo
    public String getName() {
        return "cct";
    }

    @Override // q9.lqeggnwhkg
    public Set iobyxmoadg() {
        return f21802gxszxtbevo;
    }

    public String wkgbmnqykc() {
        return this.f21808zoijcleaow;
    }

    public byte[] zoijcleaow() {
        String str = this.f21808zoijcleaow;
        if (str == null && this.f21807iobyxmoadg == null) {
            return null;
        }
        String str2 = this.f21807iobyxmoadg;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }
}
