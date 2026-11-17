package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Excluder f25201iobyxmoadg = Excluder.f24953lereixgezr;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private wflxmlrfwp f25213zoijcleaow = wflxmlrfwp.f25193zdlpuopuiu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private ppxfxbqfkf f25207ppxfxbqfkf = zoijcleaow.f25221zdlpuopuiu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f25211wkgbmnqykc = new HashMap();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f25198eablkybsjg = new ArrayList();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f25200gxszxtbevo = new ArrayList();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f25203lqeggnwhkg = false;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private String f25204nufgyqmvbu = Gson.f24910lereixgezr;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f25197dxjokdxxww = 2;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f25195btonecajqb = 2;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f25199gtknphoqwx = false;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private boolean f25196draadjrbmk = false;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private boolean f25210wflxmlrfwp = true;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f25194agtfadlqog = false;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f25205ojitshcjhn = false;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private boolean f25208rgvfuqvkyq = false;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f25209vdvldrhtss = true;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private rgvfuqvkyq f25206oxmwwwfdhm = Gson.f24912zynmafqrjb;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private rgvfuqvkyq f25202kcexrzcfyt = Gson.f24909istkbnxepw;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final LinkedList f25212zdlpuopuiu = new LinkedList();

    private void iobyxmoadg(String str, int i13, int i14, List list) {
        vdvldrhtss vdvldrhtssVarZoijcleaow;
        vdvldrhtss vdvldrhtssVarZoijcleaow2;
        boolean z13 = com.google.gson.internal.sql.iobyxmoadg.f25167iobyxmoadg;
        vdvldrhtss vdvldrhtssVarIobyxmoadg = null;
        if (str != null && !str.trim().isEmpty()) {
            vdvldrhtssVarZoijcleaow = DefaultDateTypeAdapter.zoijcleaow.f24976zoijcleaow.zoijcleaow(str);
            if (z13) {
                vdvldrhtssVarIobyxmoadg = com.google.gson.internal.sql.iobyxmoadg.f25168ppxfxbqfkf.zoijcleaow(str);
                vdvldrhtssVarZoijcleaow2 = com.google.gson.internal.sql.iobyxmoadg.f25170zoijcleaow.zoijcleaow(str);
            } else {
                vdvldrhtssVarZoijcleaow2 = null;
            }
        } else {
            if (i13 == 2 || i14 == 2) {
                return;
            }
            vdvldrhtss vdvldrhtssVarIobyxmoadg2 = DefaultDateTypeAdapter.zoijcleaow.f24976zoijcleaow.iobyxmoadg(i13, i14);
            if (z13) {
                vdvldrhtssVarIobyxmoadg = com.google.gson.internal.sql.iobyxmoadg.f25168ppxfxbqfkf.iobyxmoadg(i13, i14);
                vdvldrhtss vdvldrhtssVarIobyxmoadg3 = com.google.gson.internal.sql.iobyxmoadg.f25170zoijcleaow.iobyxmoadg(i13, i14);
                vdvldrhtssVarZoijcleaow = vdvldrhtssVarIobyxmoadg2;
                vdvldrhtssVarZoijcleaow2 = vdvldrhtssVarIobyxmoadg3;
            } else {
                vdvldrhtssVarZoijcleaow = vdvldrhtssVarIobyxmoadg2;
                vdvldrhtssVarZoijcleaow2 = null;
            }
        }
        list.add(vdvldrhtssVarZoijcleaow);
        if (z13) {
            list.add(vdvldrhtssVarIobyxmoadg);
            list.add(vdvldrhtssVarZoijcleaow2);
        }
    }

    public wkgbmnqykc eablkybsjg(rgvfuqvkyq rgvfuqvkyqVar) {
        Objects.requireNonNull(rgvfuqvkyqVar);
        this.f25206oxmwwwfdhm = rgvfuqvkyqVar;
        return this;
    }

    public wkgbmnqykc ppxfxbqfkf() {
        this.f25210wflxmlrfwp = false;
        return this;
    }

    public wkgbmnqykc wkgbmnqykc(Type type, Object obj) {
        Objects.requireNonNull(type);
        com.google.gson.internal.iobyxmoadg.iobyxmoadg((obj instanceof lqeggnwhkg) || (obj instanceof TypeAdapter));
        if (obj instanceof lqeggnwhkg) {
            this.f25198eablkybsjg.add(TreeTypeAdapter.lqeggnwhkg(be.iobyxmoadg.zoijcleaow(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            this.f25198eablkybsjg.add(TypeAdapters.iobyxmoadg(be.iobyxmoadg.zoijcleaow(type), (TypeAdapter) obj));
        }
        return this;
    }

    public Gson zoijcleaow() {
        ArrayList arrayList = new ArrayList(this.f25198eablkybsjg.size() + this.f25200gxszxtbevo.size() + 3);
        arrayList.addAll(this.f25198eablkybsjg);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f25200gxszxtbevo);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        iobyxmoadg(this.f25204nufgyqmvbu, this.f25197dxjokdxxww, this.f25195btonecajqb, arrayList);
        return new Gson(this.f25201iobyxmoadg, this.f25207ppxfxbqfkf, new HashMap(this.f25211wkgbmnqykc), this.f25203lqeggnwhkg, this.f25199gtknphoqwx, this.f25205ojitshcjhn, this.f25210wflxmlrfwp, this.f25194agtfadlqog, this.f25208rgvfuqvkyq, this.f25196draadjrbmk, this.f25209vdvldrhtss, this.f25213zoijcleaow, this.f25204nufgyqmvbu, this.f25197dxjokdxxww, this.f25195btonecajqb, new ArrayList(this.f25198eablkybsjg), new ArrayList(this.f25200gxszxtbevo), arrayList, this.f25206oxmwwwfdhm, this.f25202kcexrzcfyt, new ArrayList(this.f25212zdlpuopuiu));
    }
}
