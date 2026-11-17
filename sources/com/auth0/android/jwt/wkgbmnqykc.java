package com.auth0.android.jwt;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    final Date f20577eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    final String f20578gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final String f20579iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    final List f20580lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    final Map f20581nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final Date f20582ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final Date f20583wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final String f20584zoijcleaow;

    wkgbmnqykc(String str, String str2, Date date, Date date2, Date date3, String str3, List list, Map map) {
        this.f20579iobyxmoadg = str;
        this.f20584zoijcleaow = str2;
        this.f20582ppxfxbqfkf = date;
        this.f20583wkgbmnqykc = date2;
        this.f20577eablkybsjg = date3;
        this.f20578gxszxtbevo = str3;
        this.f20580lqeggnwhkg = list;
        this.f20581nufgyqmvbu = Collections.unmodifiableMap(map);
    }

    zoijcleaow iobyxmoadg(String str) {
        zoijcleaow zoijcleaowVar = (zoijcleaow) this.f20581nufgyqmvbu.get(str);
        return zoijcleaowVar != null ? zoijcleaowVar : new iobyxmoadg();
    }
}
