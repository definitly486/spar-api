package com.caverock.androidsvg;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private gxszxtbevo f21677iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f21678ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private yggfygwlhe f21679zoijcleaow;

    private static class agtfadlqog implements lqeggnwhkg {
        private agtfadlqog() {
        }

        @Override // com.caverock.androidsvg.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(vdvldrhtss vdvldrhtssVar, com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar) {
            return jpowsppfyaVar.f21406zoijcleaow == null;
        }

        public String toString() {
            return "root";
        }

        /* synthetic */ agtfadlqog(iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    private enum btonecajqb {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;


        /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
        private static final Map f21699tzroggbefp = new HashMap();

        static {
            for (btonecajqb btonecajqbVar : values()) {
                if (btonecajqbVar != UNSUPPORTED) {
                    f21699tzroggbefp.put(btonecajqbVar.name().replace('_', '-'), btonecajqbVar);
                }
            }
        }

        public static btonecajqb iobyxmoadg(String str) {
            btonecajqb btonecajqbVar = (btonecajqb) f21699tzroggbefp.get(str);
            return btonecajqbVar != null ? btonecajqbVar : UNSUPPORTED;
        }
    }

    private static class draadjrbmk implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f21707iobyxmoadg;

        draadjrbmk(String str) {
            this.f21707iobyxmoadg = str;
        }

        @Override // com.caverock.androidsvg.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(vdvldrhtss vdvldrhtssVar, com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar) {
            return false;
        }

        public String toString() {
            return this.f21707iobyxmoadg;
        }
    }

    private static class dxjokdxxww implements lqeggnwhkg {
        private dxjokdxxww() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.caverock.androidsvg.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(vdvldrhtss vdvldrhtssVar, com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar) {
            return !(jpowsppfyaVar instanceof com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix) || ((com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix) jpowsppfyaVar).iobyxmoadg().size() == 0;
        }

        public String toString() {
            return "empty";
        }

        /* synthetic */ dxjokdxxww(iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    private enum eablkybsjg {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    private static class gtknphoqwx implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private List f21712iobyxmoadg;

        gtknphoqwx(List list) {
            this.f21712iobyxmoadg = list;
        }

        @Override // com.caverock.androidsvg.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(vdvldrhtss vdvldrhtssVar, com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar) {
            Iterator it = this.f21712iobyxmoadg.iterator();
            while (it.hasNext()) {
                if (zoijcleaow.draadjrbmk(vdvldrhtssVar, (kcexrzcfyt) it.next(), jpowsppfyaVar)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return "not(" + this.f21712iobyxmoadg + ")";
        }

        int zoijcleaow() {
            Iterator it = this.f21712iobyxmoadg.iterator();
            int i13 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                int i14 = ((kcexrzcfyt) it.next()).f21728zoijcleaow;
                if (i14 > i13) {
                    i13 = i14;
                }
            }
            return i13;
        }
    }

    enum gxszxtbevo {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f21725iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f21726zoijcleaow;

        static {
            int[] iArr = new int[btonecajqb.values().length];
            f21726zoijcleaow = iArr;
            try {
                iArr[btonecajqb.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21726zoijcleaow[btonecajqb.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21726zoijcleaow[btonecajqb.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21726zoijcleaow[btonecajqb.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21726zoijcleaow[btonecajqb.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21726zoijcleaow[btonecajqb.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21726zoijcleaow[btonecajqb.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21726zoijcleaow[btonecajqb.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21726zoijcleaow[btonecajqb.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21726zoijcleaow[btonecajqb.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21726zoijcleaow[btonecajqb.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21726zoijcleaow[btonecajqb.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21726zoijcleaow[btonecajqb.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21726zoijcleaow[btonecajqb.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21726zoijcleaow[btonecajqb.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21726zoijcleaow[btonecajqb.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21726zoijcleaow[btonecajqb.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21726zoijcleaow[btonecajqb.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f21726zoijcleaow[btonecajqb.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f21726zoijcleaow[btonecajqb.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f21726zoijcleaow[btonecajqb.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f21726zoijcleaow[btonecajqb.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f21726zoijcleaow[btonecajqb.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f21726zoijcleaow[btonecajqb.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[ppxfxbqfkf.values().length];
            f21725iobyxmoadg = iArr2;
            try {
                iArr2[ppxfxbqfkf.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f21725iobyxmoadg[ppxfxbqfkf.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f21725iobyxmoadg[ppxfxbqfkf.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    private interface lqeggnwhkg {
        boolean iobyxmoadg(vdvldrhtss vdvldrhtssVar, com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar);
    }

    private static class nufgyqmvbu implements lqeggnwhkg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private String f21729eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f21730iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f21731ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f21732wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f21733zoijcleaow;

        nufgyqmvbu(int i13, int i14, boolean z13, boolean z14, String str) {
            this.f21730iobyxmoadg = i13;
            this.f21733zoijcleaow = i14;
            this.f21731ppxfxbqfkf = z13;
            this.f21732wkgbmnqykc = z14;
            this.f21729eablkybsjg = str;
        }

        @Override // com.caverock.androidsvg.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(vdvldrhtss vdvldrhtssVar, com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar) {
            int i13;
            int i14;
            String strAgtfadlqog = (this.f21732wkgbmnqykc && this.f21729eablkybsjg == null) ? jpowsppfyaVar.agtfadlqog() : this.f21729eablkybsjg;
            com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix pkzmftpjixVar = jpowsppfyaVar.f21406zoijcleaow;
            if (pkzmftpjixVar != null) {
                Iterator it = pkzmftpjixVar.iobyxmoadg().iterator();
                i13 = 0;
                i14 = 0;
                while (it.hasNext()) {
                    com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar2 = (com.caverock.androidsvg.lqeggnwhkg.jpowsppfya) ((com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz) it.next());
                    if (jpowsppfyaVar2 == jpowsppfyaVar) {
                        i13 = i14;
                    }
                    if (strAgtfadlqog == null || jpowsppfyaVar2.agtfadlqog().equals(strAgtfadlqog)) {
                        i14++;
                    }
                }
            } else {
                i13 = 0;
                i14 = 1;
            }
            int i15 = this.f21731ppxfxbqfkf ? i13 + 1 : i14 - i13;
            int i16 = this.f21730iobyxmoadg;
            if (i16 == 0) {
                return i15 == this.f21733zoijcleaow;
            }
            int i17 = this.f21733zoijcleaow;
            if ((i15 - i17) % i16 == 0) {
                return Integer.signum(i15 - i17) == 0 || Integer.signum(i15 - this.f21733zoijcleaow) == Integer.signum(this.f21730iobyxmoadg);
            }
            return false;
        }

        public String toString() {
            String str = this.f21731ppxfxbqfkf ? "" : "last-";
            return this.f21732wkgbmnqykc ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f21730iobyxmoadg), Integer.valueOf(this.f21733zoijcleaow), this.f21729eablkybsjg) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.f21730iobyxmoadg), Integer.valueOf(this.f21733zoijcleaow));
        }
    }

    private static class ojitshcjhn implements lqeggnwhkg {
        private ojitshcjhn() {
        }

        @Override // com.caverock.androidsvg.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(vdvldrhtss vdvldrhtssVar, com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar) {
            return vdvldrhtssVar != null && jpowsppfyaVar == vdvldrhtssVar.f21743iobyxmoadg;
        }

        public String toString() {
            return "target";
        }

        /* synthetic */ ojitshcjhn(iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    static class oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private List f21734iobyxmoadg = null;

        oxmwwwfdhm() {
        }

        void eablkybsjg(yggfygwlhe yggfygwlheVar) {
            List list = this.f21734iobyxmoadg;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((rgvfuqvkyq) it.next()).f21741ppxfxbqfkf == yggfygwlheVar) {
                    it.remove();
                }
            }
        }

        int gxszxtbevo() {
            List list = this.f21734iobyxmoadg;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        void iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar) {
            if (this.f21734iobyxmoadg == null) {
                this.f21734iobyxmoadg = new ArrayList();
            }
            for (int i13 = 0; i13 < this.f21734iobyxmoadg.size(); i13++) {
                if (((rgvfuqvkyq) this.f21734iobyxmoadg.get(i13)).f21740iobyxmoadg.f21728zoijcleaow > rgvfuqvkyqVar.f21740iobyxmoadg.f21728zoijcleaow) {
                    this.f21734iobyxmoadg.add(i13, rgvfuqvkyqVar);
                    return;
                }
            }
            this.f21734iobyxmoadg.add(rgvfuqvkyqVar);
        }

        List ppxfxbqfkf() {
            return this.f21734iobyxmoadg;
        }

        public String toString() {
            if (this.f21734iobyxmoadg == null) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder();
            Iterator it = this.f21734iobyxmoadg.iterator();
            while (it.hasNext()) {
                sb3.append(((rgvfuqvkyq) it.next()).toString());
                sb3.append('\n');
            }
            return sb3.toString();
        }

        boolean wkgbmnqykc() {
            List list = this.f21734iobyxmoadg;
            return list == null || list.isEmpty();
        }

        void zoijcleaow(oxmwwwfdhm oxmwwwfdhmVar) {
            if (oxmwwwfdhmVar.f21734iobyxmoadg == null) {
                return;
            }
            if (this.f21734iobyxmoadg == null) {
                this.f21734iobyxmoadg = new ArrayList(oxmwwwfdhmVar.f21734iobyxmoadg.size());
            }
            Iterator it = oxmwwwfdhmVar.f21734iobyxmoadg.iterator();
            while (it.hasNext()) {
                iobyxmoadg((rgvfuqvkyq) it.next());
            }
        }
    }

    private enum ppxfxbqfkf {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    static class rgvfuqvkyq {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        kcexrzcfyt f21740iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        yggfygwlhe f21741ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt f21742zoijcleaow;

        rgvfuqvkyq(kcexrzcfyt kcexrzcfytVar, com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar, yggfygwlhe yggfygwlheVar) {
            this.f21740iobyxmoadg = kcexrzcfytVar;
            this.f21742zoijcleaow = yadqdtsiqtVar;
            this.f21741ppxfxbqfkf = yggfygwlheVar;
        }

        public String toString() {
            return String.valueOf(this.f21740iobyxmoadg) + " {...} (src=" + this.f21741ppxfxbqfkf + ")";
        }
    }

    static class vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        com.caverock.androidsvg.lqeggnwhkg.jpowsppfya f21743iobyxmoadg;

        vdvldrhtss() {
        }

        public String toString() {
            com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar = this.f21743iobyxmoadg;
            return jpowsppfyaVar != null ? String.format("<%s id=\"%s\">", jpowsppfyaVar.agtfadlqog(), this.f21743iobyxmoadg.f21448ppxfxbqfkf) : "";
        }
    }

    private static class wflxmlrfwp implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f21744iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f21745zoijcleaow;

        public wflxmlrfwp(boolean z13, String str) {
            this.f21744iobyxmoadg = z13;
            this.f21745zoijcleaow = str;
        }

        @Override // com.caverock.androidsvg.zoijcleaow.lqeggnwhkg
        public boolean iobyxmoadg(vdvldrhtss vdvldrhtssVar, com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar) {
            int i13;
            String strAgtfadlqog = (this.f21744iobyxmoadg && this.f21745zoijcleaow == null) ? jpowsppfyaVar.agtfadlqog() : this.f21745zoijcleaow;
            com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix pkzmftpjixVar = jpowsppfyaVar.f21406zoijcleaow;
            if (pkzmftpjixVar != null) {
                Iterator it = pkzmftpjixVar.iobyxmoadg().iterator();
                i13 = 0;
                while (it.hasNext()) {
                    com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar2 = (com.caverock.androidsvg.lqeggnwhkg.jpowsppfya) ((com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz) it.next());
                    if (strAgtfadlqog == null || jpowsppfyaVar2.agtfadlqog().equals(strAgtfadlqog)) {
                        i13++;
                    }
                }
            } else {
                i13 = 1;
            }
            return i13 == 1;
        }

        public String toString() {
            return this.f21744iobyxmoadg ? String.format("only-of-type <%s>", this.f21745zoijcleaow) : String.format("only-child", new Object[0]);
        }
    }

    private static class wkgbmnqykc extends com.caverock.androidsvg.dxjokdxxww.C0388dxjokdxxww {

        private static class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public int f21746iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            public int f21747zoijcleaow;

            iobyxmoadg(int i13, int i14) {
                this.f21746iobyxmoadg = i13;
                this.f21747zoijcleaow = i14;
            }
        }

        wkgbmnqykc(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        private iobyxmoadg cdpycssgdh() {
            com.caverock.androidsvg.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf;
            iobyxmoadg iobyxmoadgVar;
            if (nufgyqmvbu()) {
                return null;
            }
            int i13 = this.f21225zoijcleaow;
            if (!gxszxtbevo('(')) {
                return null;
            }
            pmvmpeiblj();
            int i14 = 1;
            if (lqeggnwhkg("odd")) {
                iobyxmoadgVar = new iobyxmoadg(2, 1);
            } else {
                if (lqeggnwhkg("even")) {
                    iobyxmoadgVar = new iobyxmoadg(2, 0);
                } else {
                    int i15 = (!gxszxtbevo('+') && gxszxtbevo('-')) ? -1 : 1;
                    com.caverock.androidsvg.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf2 = com.caverock.androidsvg.ppxfxbqfkf.ppxfxbqfkf(this.f21222iobyxmoadg, this.f21225zoijcleaow, this.f21223ppxfxbqfkf, false);
                    if (ppxfxbqfkfVarPpxfxbqfkf2 != null) {
                        this.f21225zoijcleaow = ppxfxbqfkfVarPpxfxbqfkf2.iobyxmoadg();
                    }
                    if (gxszxtbevo('n') || gxszxtbevo('N')) {
                        if (ppxfxbqfkfVarPpxfxbqfkf2 == null) {
                            ppxfxbqfkfVarPpxfxbqfkf2 = new com.caverock.androidsvg.ppxfxbqfkf(1L, this.f21225zoijcleaow);
                        }
                        pmvmpeiblj();
                        boolean zGxszxtbevo = gxszxtbevo('+');
                        if (!zGxszxtbevo && (zGxszxtbevo = gxszxtbevo('-'))) {
                            i14 = -1;
                        }
                        if (zGxszxtbevo) {
                            pmvmpeiblj();
                            ppxfxbqfkfVarPpxfxbqfkf = com.caverock.androidsvg.ppxfxbqfkf.ppxfxbqfkf(this.f21222iobyxmoadg, this.f21225zoijcleaow, this.f21223ppxfxbqfkf, false);
                            if (ppxfxbqfkfVarPpxfxbqfkf == null) {
                                this.f21225zoijcleaow = i13;
                                return null;
                            }
                            this.f21225zoijcleaow = ppxfxbqfkfVarPpxfxbqfkf.iobyxmoadg();
                        } else {
                            ppxfxbqfkfVarPpxfxbqfkf = null;
                        }
                        int i16 = i14;
                        i14 = i15;
                        i15 = i16;
                    } else {
                        ppxfxbqfkfVarPpxfxbqfkf = ppxfxbqfkfVarPpxfxbqfkf2;
                        ppxfxbqfkfVarPpxfxbqfkf2 = null;
                    }
                    iobyxmoadgVar = new iobyxmoadg(ppxfxbqfkfVarPpxfxbqfkf2 == null ? 0 : i14 * ppxfxbqfkfVarPpxfxbqfkf2.wkgbmnqykc(), ppxfxbqfkfVarPpxfxbqfkf != null ? i15 * ppxfxbqfkfVarPpxfxbqfkf.wkgbmnqykc() : 0);
                }
            }
            pmvmpeiblj();
            if (gxszxtbevo(')')) {
                return iobyxmoadgVar;
            }
            this.f21225zoijcleaow = i13;
            return null;
        }

        private void dsvhmnatus(kcexrzcfyt kcexrzcfytVar, zdlpuopuiu zdlpuopuiuVar) throws com.caverock.androidsvg.iobyxmoadg {
            lqeggnwhkg lqeggnwhkgVar;
            lqeggnwhkg lqeggnwhkgVar2;
            String strWwaezpbzkn = wwaezpbzkn();
            if (strWwaezpbzkn == null) {
                throw new com.caverock.androidsvg.iobyxmoadg("Invalid pseudo class");
            }
            btonecajqb btonecajqbVarIobyxmoadg = btonecajqb.iobyxmoadg(strWwaezpbzkn);
            iobyxmoadg iobyxmoadgVar = null;
            switch (iobyxmoadg.f21726zoijcleaow[btonecajqbVarIobyxmoadg.ordinal()]) {
                case 1:
                    lqeggnwhkg nufgyqmvbuVar = new nufgyqmvbu(0, 1, true, false, null);
                    kcexrzcfytVar.zoijcleaow();
                    lqeggnwhkgVar2 = nufgyqmvbuVar;
                    zdlpuopuiuVar.zoijcleaow(lqeggnwhkgVar2);
                    return;
                case 2:
                    lqeggnwhkg nufgyqmvbuVar2 = new nufgyqmvbu(0, 1, false, false, null);
                    kcexrzcfytVar.zoijcleaow();
                    lqeggnwhkgVar2 = nufgyqmvbuVar2;
                    zdlpuopuiuVar.zoijcleaow(lqeggnwhkgVar2);
                    return;
                case 3:
                    lqeggnwhkg wflxmlrfwpVar = new wflxmlrfwp(false, null);
                    kcexrzcfytVar.zoijcleaow();
                    lqeggnwhkgVar2 = wflxmlrfwpVar;
                    zdlpuopuiuVar.zoijcleaow(lqeggnwhkgVar2);
                    return;
                case 4:
                    lqeggnwhkg nufgyqmvbuVar3 = new nufgyqmvbu(0, 1, true, true, zdlpuopuiuVar.f21754zoijcleaow);
                    kcexrzcfytVar.zoijcleaow();
                    lqeggnwhkgVar2 = nufgyqmvbuVar3;
                    zdlpuopuiuVar.zoijcleaow(lqeggnwhkgVar2);
                    return;
                case 5:
                    lqeggnwhkg nufgyqmvbuVar4 = new nufgyqmvbu(0, 1, false, true, zdlpuopuiuVar.f21754zoijcleaow);
                    kcexrzcfytVar.zoijcleaow();
                    lqeggnwhkgVar2 = nufgyqmvbuVar4;
                    zdlpuopuiuVar.zoijcleaow(lqeggnwhkgVar2);
                    return;
                case 6:
                    lqeggnwhkg wflxmlrfwpVar2 = new wflxmlrfwp(true, zdlpuopuiuVar.f21754zoijcleaow);
                    kcexrzcfytVar.zoijcleaow();
                    lqeggnwhkgVar2 = wflxmlrfwpVar2;
                    zdlpuopuiuVar.zoijcleaow(lqeggnwhkgVar2);
                    return;
                case 7:
                    lqeggnwhkg agtfadlqogVar = new agtfadlqog(iobyxmoadgVar);
                    kcexrzcfytVar.zoijcleaow();
                    lqeggnwhkgVar2 = agtfadlqogVar;
                    zdlpuopuiuVar.zoijcleaow(lqeggnwhkgVar2);
                    return;
                case 8:
                    lqeggnwhkg dxjokdxxwwVar = new dxjokdxxww(iobyxmoadgVar);
                    kcexrzcfytVar.zoijcleaow();
                    lqeggnwhkgVar2 = dxjokdxxwwVar;
                    zdlpuopuiuVar.zoijcleaow(lqeggnwhkgVar2);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z13 = btonecajqbVarIobyxmoadg == btonecajqb.nth_child || btonecajqbVarIobyxmoadg == btonecajqb.nth_of_type;
                    boolean z14 = btonecajqbVarIobyxmoadg == btonecajqb.nth_of_type || btonecajqbVarIobyxmoadg == btonecajqb.nth_last_of_type;
                    iobyxmoadg iobyxmoadgVarCdpycssgdh = cdpycssgdh();
                    if (iobyxmoadgVarCdpycssgdh == null) {
                        throw new com.caverock.androidsvg.iobyxmoadg("Invalid or missing parameter section for pseudo class: " + strWwaezpbzkn);
                    }
                    lqeggnwhkg nufgyqmvbuVar5 = new nufgyqmvbu(iobyxmoadgVarCdpycssgdh.f21746iobyxmoadg, iobyxmoadgVarCdpycssgdh.f21747zoijcleaow, z13, z14, zdlpuopuiuVar.f21754zoijcleaow);
                    kcexrzcfytVar.zoijcleaow();
                    lqeggnwhkgVar = nufgyqmvbuVar5;
                    lqeggnwhkgVar2 = lqeggnwhkgVar;
                    zdlpuopuiuVar.zoijcleaow(lqeggnwhkgVar2);
                    return;
                case 13:
                    List listHcddaimhww = hcddaimhww();
                    if (listHcddaimhww == null) {
                        throw new com.caverock.androidsvg.iobyxmoadg("Invalid or missing parameter section for pseudo class: " + strWwaezpbzkn);
                    }
                    gtknphoqwx gtknphoqwxVar = new gtknphoqwx(listHcddaimhww);
                    kcexrzcfytVar.f21728zoijcleaow = gtknphoqwxVar.zoijcleaow();
                    lqeggnwhkgVar = gtknphoqwxVar;
                    lqeggnwhkgVar2 = lqeggnwhkgVar;
                    zdlpuopuiuVar.zoijcleaow(lqeggnwhkgVar2);
                    return;
                case 14:
                    lqeggnwhkg ojitshcjhnVar = new ojitshcjhn(iobyxmoadgVar);
                    kcexrzcfytVar.zoijcleaow();
                    lqeggnwhkgVar2 = ojitshcjhnVar;
                    zdlpuopuiuVar.zoijcleaow(lqeggnwhkgVar2);
                    return;
                case 15:
                    lmojexxdyd();
                    lqeggnwhkg draadjrbmkVar = new draadjrbmk(strWwaezpbzkn);
                    kcexrzcfytVar.zoijcleaow();
                    lqeggnwhkgVar2 = draadjrbmkVar;
                    zdlpuopuiuVar.zoijcleaow(lqeggnwhkgVar2);
                    return;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    lqeggnwhkg draadjrbmkVar2 = new draadjrbmk(strWwaezpbzkn);
                    kcexrzcfytVar.zoijcleaow();
                    lqeggnwhkgVar2 = draadjrbmkVar2;
                    zdlpuopuiuVar.zoijcleaow(lqeggnwhkgVar2);
                    return;
                default:
                    throw new com.caverock.androidsvg.iobyxmoadg("Unsupported pseudo class: " + strWwaezpbzkn);
            }
        }

        private List hcddaimhww() {
            List list;
            List list2;
            if (nufgyqmvbu()) {
                return null;
            }
            int i13 = this.f21225zoijcleaow;
            if (!gxszxtbevo('(')) {
                return null;
            }
            pmvmpeiblj();
            List listJpowsppfya = jpowsppfya();
            if (listJpowsppfya == null) {
                this.f21225zoijcleaow = i13;
                return null;
            }
            if (!gxszxtbevo(')')) {
                this.f21225zoijcleaow = i13;
                return null;
            }
            Iterator it = listJpowsppfya.iterator();
            while (it.hasNext() && (list = ((kcexrzcfyt) it.next()).f21727iobyxmoadg) != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext() && (list2 = ((zdlpuopuiu) it2.next()).f21753wkgbmnqykc) != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (((lqeggnwhkg) it3.next()) instanceof gtknphoqwx) {
                            return null;
                        }
                    }
                }
            }
            return listJpowsppfya;
        }

        private int istkbnxepw(int i13) {
            if (i13 >= 48 && i13 <= 57) {
                return i13 - 48;
            }
            if (i13 >= 65 && i13 <= 70) {
                return i13 - 55;
            }
            if (i13 < 97 || i13 > 102) {
                return -1;
            }
            return i13 - 87;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List jpowsppfya() {
            iobyxmoadg iobyxmoadgVar = null;
            if (nufgyqmvbu()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(iobyxmoadgVar);
            while (!nufgyqmvbu() && hkdspvbjdz(kcexrzcfytVar)) {
                if (lereixgezr()) {
                    arrayList.add(kcexrzcfytVar);
                    kcexrzcfytVar = new kcexrzcfyt(iobyxmoadgVar);
                }
            }
            if (!kcexrzcfytVar.gxszxtbevo()) {
                arrayList.add(kcexrzcfytVar);
            }
            return arrayList;
        }

        private List lmojexxdyd() {
            if (nufgyqmvbu()) {
                return null;
            }
            int i13 = this.f21225zoijcleaow;
            if (!gxszxtbevo('(')) {
                return null;
            }
            pmvmpeiblj();
            ArrayList arrayList = null;
            do {
                String strWwaezpbzkn = wwaezpbzkn();
                if (strWwaezpbzkn == null) {
                    this.f21225zoijcleaow = i13;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strWwaezpbzkn);
                pmvmpeiblj();
            } while (lereixgezr());
            if (gxszxtbevo(')')) {
                return arrayList;
            }
            this.f21225zoijcleaow = i13;
            return null;
        }

        private int wypolnanlu() {
            int i13;
            if (nufgyqmvbu()) {
                return this.f21225zoijcleaow;
            }
            int i14 = this.f21225zoijcleaow;
            int iCharAt = this.f21222iobyxmoadg.charAt(i14);
            if (iCharAt == 45) {
                iCharAt = iobyxmoadg();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i13 = i14;
            } else {
                int iIobyxmoadg = iobyxmoadg();
                while (true) {
                    if ((iIobyxmoadg < 65 || iIobyxmoadg > 90) && ((iIobyxmoadg < 97 || iIobyxmoadg > 122) && !((iIobyxmoadg >= 48 && iIobyxmoadg <= 57) || iIobyxmoadg == 45 || iIobyxmoadg == 95))) {
                        break;
                    }
                    iIobyxmoadg = iobyxmoadg();
                }
                i13 = this.f21225zoijcleaow;
            }
            this.f21225zoijcleaow = i14;
            return i13;
        }

        private String yadqdtsiqt() {
            if (nufgyqmvbu()) {
                return null;
            }
            String strVdvldrhtss = vdvldrhtss();
            return strVdvldrhtss != null ? strVdvldrhtss : wwaezpbzkn();
        }

        String cllcsxoeiz() {
            if (nufgyqmvbu()) {
                return null;
            }
            int i13 = this.f21225zoijcleaow;
            if (!lqeggnwhkg("url(")) {
                return null;
            }
            pmvmpeiblj();
            String strIozdgvuglv = iozdgvuglv();
            if (strIozdgvuglv == null) {
                strIozdgvuglv = ylkuphrtab();
            }
            if (strIozdgvuglv == null) {
                this.f21225zoijcleaow = i13;
                return null;
            }
            pmvmpeiblj();
            if (nufgyqmvbu() || lqeggnwhkg(")")) {
                return strIozdgvuglv;
            }
            this.f21225zoijcleaow = i13;
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002d  */
        boolean hkdspvbjdz(kcexrzcfyt kcexrzcfytVar) throws com.caverock.androidsvg.iobyxmoadg {
            eablkybsjg eablkybsjgVar;
            zdlpuopuiu zdlpuopuiuVar;
            ppxfxbqfkf ppxfxbqfkfVar;
            String strYadqdtsiqt;
            if (nufgyqmvbu()) {
                return false;
            }
            int i13 = this.f21225zoijcleaow;
            if (kcexrzcfytVar.gxszxtbevo()) {
                eablkybsjgVar = null;
            } else if (gxszxtbevo('>')) {
                eablkybsjgVar = eablkybsjg.CHILD;
                pmvmpeiblj();
            } else if (gxszxtbevo('+')) {
                eablkybsjgVar = eablkybsjg.FOLLOWS;
                pmvmpeiblj();
            } else {
                eablkybsjgVar = null;
            }
            if (gxszxtbevo('*')) {
                zdlpuopuiuVar = new zdlpuopuiu(eablkybsjgVar, null);
            } else {
                String strWwaezpbzkn = wwaezpbzkn();
                if (strWwaezpbzkn != null) {
                    zdlpuopuiu zdlpuopuiuVar2 = new zdlpuopuiu(eablkybsjgVar, strWwaezpbzkn);
                    kcexrzcfytVar.ppxfxbqfkf();
                    zdlpuopuiuVar = zdlpuopuiuVar2;
                } else {
                    zdlpuopuiuVar = null;
                }
            }
            while (!nufgyqmvbu()) {
                if (!gxszxtbevo('.')) {
                    if (!gxszxtbevo('#')) {
                        if (!gxszxtbevo('[')) {
                            if (!gxszxtbevo(':')) {
                                break;
                            }
                            if (zdlpuopuiuVar == null) {
                                zdlpuopuiuVar = new zdlpuopuiu(eablkybsjgVar, null);
                            }
                            dsvhmnatus(kcexrzcfytVar, zdlpuopuiuVar);
                        } else {
                            if (zdlpuopuiuVar == null) {
                                zdlpuopuiuVar = new zdlpuopuiu(eablkybsjgVar, null);
                            }
                            pmvmpeiblj();
                            String strWwaezpbzkn2 = wwaezpbzkn();
                            if (strWwaezpbzkn2 == null) {
                                throw new com.caverock.androidsvg.iobyxmoadg("Invalid attribute simpleSelectors");
                            }
                            pmvmpeiblj();
                            if (gxszxtbevo('=')) {
                                ppxfxbqfkfVar = ppxfxbqfkf.EQUALS;
                            } else if (lqeggnwhkg("~=")) {
                                ppxfxbqfkfVar = ppxfxbqfkf.INCLUDES;
                            } else {
                                ppxfxbqfkfVar = lqeggnwhkg("|=") ? ppxfxbqfkf.DASHMATCH : null;
                            }
                            if (ppxfxbqfkfVar != null) {
                                pmvmpeiblj();
                                strYadqdtsiqt = yadqdtsiqt();
                                if (strYadqdtsiqt == null) {
                                    throw new com.caverock.androidsvg.iobyxmoadg("Invalid attribute simpleSelectors");
                                }
                                pmvmpeiblj();
                            } else {
                                strYadqdtsiqt = null;
                            }
                            if (!gxszxtbevo(']')) {
                                throw new com.caverock.androidsvg.iobyxmoadg("Invalid attribute simpleSelectors");
                            }
                            if (ppxfxbqfkfVar == null) {
                                ppxfxbqfkfVar = ppxfxbqfkf.EXISTS;
                            }
                            zdlpuopuiuVar.iobyxmoadg(strWwaezpbzkn2, ppxfxbqfkfVar, strYadqdtsiqt);
                            kcexrzcfytVar.zoijcleaow();
                        }
                    } else {
                        if (zdlpuopuiuVar == null) {
                            zdlpuopuiuVar = new zdlpuopuiu(eablkybsjgVar, null);
                        }
                        String strWwaezpbzkn3 = wwaezpbzkn();
                        if (strWwaezpbzkn3 == null) {
                            throw new com.caverock.androidsvg.iobyxmoadg("Invalid \"#id\" simpleSelectors");
                        }
                        zdlpuopuiuVar.iobyxmoadg("id", ppxfxbqfkf.EQUALS, strWwaezpbzkn3);
                        kcexrzcfytVar.wkgbmnqykc();
                    }
                } else {
                    if (zdlpuopuiuVar == null) {
                        zdlpuopuiuVar = new zdlpuopuiu(eablkybsjgVar, null);
                    }
                    String strWwaezpbzkn4 = wwaezpbzkn();
                    if (strWwaezpbzkn4 == null) {
                        throw new com.caverock.androidsvg.iobyxmoadg("Invalid \".class\" simpleSelectors");
                    }
                    zdlpuopuiuVar.iobyxmoadg("class", ppxfxbqfkf.EQUALS, strWwaezpbzkn4);
                    kcexrzcfytVar.zoijcleaow();
                }
            }
            if (zdlpuopuiuVar != null) {
                kcexrzcfytVar.iobyxmoadg(zdlpuopuiuVar);
                return true;
            }
            this.f21225zoijcleaow = i13;
            return false;
        }

        String iozdgvuglv() {
            int iIstkbnxepw;
            if (nufgyqmvbu()) {
                return null;
            }
            char cCharAt = this.f21222iobyxmoadg.charAt(this.f21225zoijcleaow);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            this.f21225zoijcleaow++;
            int iIntValue = draadjrbmk().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = draadjrbmk().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = draadjrbmk().intValue();
                        } else {
                            int iIstkbnxepw2 = istkbnxepw(iIntValue);
                            if (iIstkbnxepw2 != -1) {
                                for (int i13 = 1; i13 <= 5 && (iIstkbnxepw = istkbnxepw((iIntValue = draadjrbmk().intValue()))) != -1; i13++) {
                                    iIstkbnxepw2 = (iIstkbnxepw2 * 16) + iIstkbnxepw;
                                }
                                sb3.append((char) iIstkbnxepw2);
                            }
                        }
                    }
                }
                sb3.append((char) iIntValue);
                iIntValue = draadjrbmk().intValue();
            }
            return sb3.toString();
        }

        String pkzmftpjix() {
            if (nufgyqmvbu()) {
                return null;
            }
            int i13 = this.f21225zoijcleaow;
            int iCharAt = this.f21222iobyxmoadg.charAt(i13);
            int i14 = i13;
            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !btonecajqb(iCharAt)) {
                if (!gtknphoqwx(iCharAt)) {
                    i14 = this.f21225zoijcleaow + 1;
                }
                iCharAt = iobyxmoadg();
            }
            if (this.f21225zoijcleaow > i13) {
                return this.f21222iobyxmoadg.substring(i13, i14);
            }
            this.f21225zoijcleaow = i13;
            return null;
        }

        String wwaezpbzkn() {
            int iWypolnanlu = wypolnanlu();
            int i13 = this.f21225zoijcleaow;
            if (iWypolnanlu == i13) {
                return null;
            }
            String strSubstring = this.f21222iobyxmoadg.substring(i13, iWypolnanlu);
            this.f21225zoijcleaow = iWypolnanlu;
            return strSubstring;
        }

        String ylkuphrtab() {
            char cCharAt;
            int iIstkbnxepw;
            StringBuilder sb3 = new StringBuilder();
            while (!nufgyqmvbu() && (cCharAt = this.f21222iobyxmoadg.charAt(this.f21225zoijcleaow)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !gtknphoqwx(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                this.f21225zoijcleaow++;
                if (cCharAt == '\\') {
                    if (!nufgyqmvbu()) {
                        String str = this.f21222iobyxmoadg;
                        int i13 = this.f21225zoijcleaow;
                        this.f21225zoijcleaow = i13 + 1;
                        cCharAt = str.charAt(i13);
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                            int iIstkbnxepw2 = istkbnxepw(cCharAt);
                            if (iIstkbnxepw2 != -1) {
                                for (int i14 = 1; i14 <= 5 && !nufgyqmvbu() && (iIstkbnxepw = istkbnxepw(this.f21222iobyxmoadg.charAt(this.f21225zoijcleaow))) != -1; i14++) {
                                    this.f21225zoijcleaow++;
                                    iIstkbnxepw2 = (iIstkbnxepw2 * 16) + iIstkbnxepw;
                                }
                                sb3.append((char) iIstkbnxepw2);
                            }
                        }
                    }
                }
                sb3.append(cCharAt);
            }
            if (sb3.length() == 0) {
                return null;
            }
            return sb3.toString();
        }
    }

    enum yggfygwlhe {
        Document,
        RenderOptions
    }

    private static class zdlpuopuiu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        eablkybsjg f21751iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        List f21752ppxfxbqfkf = null;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        List f21753wkgbmnqykc = null;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        String f21754zoijcleaow;

        zdlpuopuiu(eablkybsjg eablkybsjgVar, String str) {
            this.f21751iobyxmoadg = null;
            this.f21754zoijcleaow = null;
            this.f21751iobyxmoadg = eablkybsjgVar == null ? eablkybsjg.DESCENDANT : eablkybsjgVar;
            this.f21754zoijcleaow = str;
        }

        void iobyxmoadg(String str, ppxfxbqfkf ppxfxbqfkfVar, String str2) {
            if (this.f21752ppxfxbqfkf == null) {
                this.f21752ppxfxbqfkf = new ArrayList();
            }
            this.f21752ppxfxbqfkf.add(new C0392zoijcleaow(str, ppxfxbqfkfVar, str2));
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            eablkybsjg eablkybsjgVar = this.f21751iobyxmoadg;
            if (eablkybsjgVar == eablkybsjg.CHILD) {
                sb3.append("> ");
            } else if (eablkybsjgVar == eablkybsjg.FOLLOWS) {
                sb3.append("+ ");
            }
            String str = this.f21754zoijcleaow;
            if (str == null) {
                str = "*";
            }
            sb3.append(str);
            List<C0392zoijcleaow> list = this.f21752ppxfxbqfkf;
            if (list != null) {
                for (C0392zoijcleaow c0392zoijcleaow : list) {
                    sb3.append('[');
                    sb3.append(c0392zoijcleaow.f21755iobyxmoadg);
                    int i13 = iobyxmoadg.f21725iobyxmoadg[c0392zoijcleaow.f21757zoijcleaow.ordinal()];
                    if (i13 == 1) {
                        sb3.append('=');
                        sb3.append(c0392zoijcleaow.f21756ppxfxbqfkf);
                    } else if (i13 == 2) {
                        sb3.append("~=");
                        sb3.append(c0392zoijcleaow.f21756ppxfxbqfkf);
                    } else if (i13 == 3) {
                        sb3.append("|=");
                        sb3.append(c0392zoijcleaow.f21756ppxfxbqfkf);
                    }
                    sb3.append(']');
                }
            }
            List<lqeggnwhkg> list2 = this.f21753wkgbmnqykc;
            if (list2 != null) {
                for (lqeggnwhkg lqeggnwhkgVar : list2) {
                    sb3.append(':');
                    sb3.append(lqeggnwhkgVar);
                }
            }
            return sb3.toString();
        }

        void zoijcleaow(lqeggnwhkg lqeggnwhkgVar) {
            if (this.f21753wkgbmnqykc == null) {
                this.f21753wkgbmnqykc = new ArrayList();
            }
            this.f21753wkgbmnqykc.add(lqeggnwhkgVar);
        }
    }

    /* JADX INFO: renamed from: com.caverock.androidsvg.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    private static class C0392zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final String f21755iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final String f21756ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final ppxfxbqfkf f21757zoijcleaow;

        C0392zoijcleaow(String str, ppxfxbqfkf ppxfxbqfkfVar, String str2) {
            this.f21755iobyxmoadg = str;
            this.f21757zoijcleaow = ppxfxbqfkfVar;
            this.f21756ppxfxbqfkf = str2;
        }
    }

    zoijcleaow(yggfygwlhe yggfygwlheVar) {
        this(gxszxtbevo.screen, yggfygwlheVar);
    }

    private static boolean agtfadlqog(vdvldrhtss vdvldrhtssVar, zdlpuopuiu zdlpuopuiuVar, List list, int i13, com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar) {
        List list2;
        String str = zdlpuopuiuVar.f21754zoijcleaow;
        if (str != null && !str.equals(jpowsppfyaVar.agtfadlqog().toLowerCase(Locale.US))) {
            return false;
        }
        List<C0392zoijcleaow> list3 = zdlpuopuiuVar.f21752ppxfxbqfkf;
        if (list3 != null) {
            for (C0392zoijcleaow c0392zoijcleaow : list3) {
                String str2 = c0392zoijcleaow.f21755iobyxmoadg;
                str2.hashCode();
                if (str2.equals("id")) {
                    if (!c0392zoijcleaow.f21756ppxfxbqfkf.equals(jpowsppfyaVar.f21448ppxfxbqfkf)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = jpowsppfyaVar.f21447lqeggnwhkg) == null || !list2.contains(c0392zoijcleaow.f21756ppxfxbqfkf)) {
                    return false;
                }
            }
        }
        List list4 = zdlpuopuiuVar.f21753wkgbmnqykc;
        if (list4 == null) {
            return true;
        }
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            if (!((lqeggnwhkg) it.next()).iobyxmoadg(vdvldrhtssVar, jpowsppfyaVar)) {
                return false;
            }
        }
        return true;
    }

    private oxmwwwfdhm btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        oxmwwwfdhm oxmwwwfdhmVar = new oxmwwwfdhm();
        while (!wkgbmnqykcVar.nufgyqmvbu()) {
            try {
                if (!wkgbmnqykcVar.lqeggnwhkg("<!--") && !wkgbmnqykcVar.lqeggnwhkg("-->")) {
                    if (!wkgbmnqykcVar.gxszxtbevo('@')) {
                        if (!dxjokdxxww(oxmwwwfdhmVar, wkgbmnqykcVar)) {
                            break;
                        }
                    } else {
                        eablkybsjg(oxmwwwfdhmVar, wkgbmnqykcVar);
                    }
                }
            } catch (com.caverock.androidsvg.iobyxmoadg e13) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e13.getMessage());
            }
        }
        return oxmwwwfdhmVar;
    }

    static boolean draadjrbmk(vdvldrhtss vdvldrhtssVar, kcexrzcfyt kcexrzcfytVar, com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = jpowsppfyaVar.f21406zoijcleaow; obj != null; obj = ((com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz) obj).f21406zoijcleaow) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return kcexrzcfytVar.lqeggnwhkg() == 1 ? agtfadlqog(vdvldrhtssVar, kcexrzcfytVar.eablkybsjg(0), arrayList, size, jpowsppfyaVar) : gtknphoqwx(vdvldrhtssVar, kcexrzcfytVar, kcexrzcfytVar.lqeggnwhkg() - 1, arrayList, size, jpowsppfyaVar);
    }

    private boolean dxjokdxxww(oxmwwwfdhm oxmwwwfdhmVar, wkgbmnqykc wkgbmnqykcVar) throws com.caverock.androidsvg.iobyxmoadg {
        List listJpowsppfya = wkgbmnqykcVar.jpowsppfya();
        if (listJpowsppfya == null || listJpowsppfya.isEmpty()) {
            return false;
        }
        if (!wkgbmnqykcVar.gxszxtbevo('{')) {
            throw new com.caverock.androidsvg.iobyxmoadg("Malformed rule block: expected '{'");
        }
        wkgbmnqykcVar.pmvmpeiblj();
        com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVarLqeggnwhkg = lqeggnwhkg(wkgbmnqykcVar);
        wkgbmnqykcVar.pmvmpeiblj();
        Iterator it = listJpowsppfya.iterator();
        while (it.hasNext()) {
            oxmwwwfdhmVar.iobyxmoadg(new rgvfuqvkyq((kcexrzcfyt) it.next(), yadqdtsiqtVarLqeggnwhkg, this.f21679zoijcleaow));
        }
        return true;
    }

    private void eablkybsjg(oxmwwwfdhm oxmwwwfdhmVar, wkgbmnqykc wkgbmnqykcVar) throws com.caverock.androidsvg.iobyxmoadg {
        String strWwaezpbzkn = wkgbmnqykcVar.wwaezpbzkn();
        wkgbmnqykcVar.pmvmpeiblj();
        if (strWwaezpbzkn == null) {
            throw new com.caverock.androidsvg.iobyxmoadg("Invalid '@' rule");
        }
        if (!this.f21678ppxfxbqfkf && strWwaezpbzkn.equals("media")) {
            List listNufgyqmvbu = nufgyqmvbu(wkgbmnqykcVar);
            if (!wkgbmnqykcVar.gxszxtbevo('{')) {
                throw new com.caverock.androidsvg.iobyxmoadg("Invalid @media rule: missing rule set");
            }
            wkgbmnqykcVar.pmvmpeiblj();
            if (ppxfxbqfkf(listNufgyqmvbu, this.f21677iobyxmoadg)) {
                this.f21678ppxfxbqfkf = true;
                oxmwwwfdhmVar.zoijcleaow(btonecajqb(wkgbmnqykcVar));
                this.f21678ppxfxbqfkf = false;
            } else {
                btonecajqb(wkgbmnqykcVar);
            }
            if (!wkgbmnqykcVar.nufgyqmvbu() && !wkgbmnqykcVar.gxszxtbevo('}')) {
                throw new com.caverock.androidsvg.iobyxmoadg("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f21678ppxfxbqfkf || !strWwaezpbzkn.equals("import")) {
            rgvfuqvkyq("Ignoring @%s rule", strWwaezpbzkn);
            ojitshcjhn(wkgbmnqykcVar);
        } else {
            String strCllcsxoeiz = wkgbmnqykcVar.cllcsxoeiz();
            if (strCllcsxoeiz == null) {
                strCllcsxoeiz = wkgbmnqykcVar.iozdgvuglv();
            }
            if (strCllcsxoeiz == null) {
                throw new com.caverock.androidsvg.iobyxmoadg("Invalid @import rule: expected string or url()");
            }
            wkgbmnqykcVar.pmvmpeiblj();
            nufgyqmvbu(wkgbmnqykcVar);
            if (!wkgbmnqykcVar.nufgyqmvbu() && !wkgbmnqykcVar.gxszxtbevo(';')) {
                throw new com.caverock.androidsvg.iobyxmoadg("Invalid @media rule: expected '}' at end of rule set");
            }
            com.caverock.androidsvg.lqeggnwhkg.gtknphoqwx();
        }
        wkgbmnqykcVar.pmvmpeiblj();
    }

    private static boolean gtknphoqwx(vdvldrhtss vdvldrhtssVar, kcexrzcfyt kcexrzcfytVar, int i13, List list, int i14, com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar) {
        zdlpuopuiu zdlpuopuiuVarEablkybsjg = kcexrzcfytVar.eablkybsjg(i13);
        if (!agtfadlqog(vdvldrhtssVar, zdlpuopuiuVarEablkybsjg, list, i14, jpowsppfyaVar)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = zdlpuopuiuVarEablkybsjg.f21751iobyxmoadg;
        if (eablkybsjgVar == eablkybsjg.DESCENDANT) {
            if (i13 == 0) {
                return true;
            }
            while (i14 >= 0) {
                if (wflxmlrfwp(vdvldrhtssVar, kcexrzcfytVar, i13 - 1, list, i14)) {
                    return true;
                }
                i14--;
            }
            return false;
        }
        if (eablkybsjgVar == eablkybsjg.CHILD) {
            return wflxmlrfwp(vdvldrhtssVar, kcexrzcfytVar, i13 - 1, list, i14);
        }
        int iIobyxmoadg = iobyxmoadg(list, i14, jpowsppfyaVar);
        if (iIobyxmoadg <= 0) {
            return false;
        }
        return gtknphoqwx(vdvldrhtssVar, kcexrzcfytVar, i13 - 1, list, i14, (com.caverock.androidsvg.lqeggnwhkg.jpowsppfya) jpowsppfyaVar.f21406zoijcleaow.iobyxmoadg().get(iIobyxmoadg - 1));
    }

    public static List gxszxtbevo(String str) {
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(str);
        ArrayList arrayList = null;
        while (!wkgbmnqykcVar.nufgyqmvbu()) {
            String strOxmwwwfdhm = wkgbmnqykcVar.oxmwwwfdhm();
            if (strOxmwwwfdhm != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strOxmwwwfdhm);
                wkgbmnqykcVar.pmvmpeiblj();
            }
        }
        return arrayList;
    }

    private static int iobyxmoadg(List list, int i13, com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar) {
        int i14 = 0;
        if (i13 < 0) {
            return 0;
        }
        Object obj = list.get(i13);
        com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix pkzmftpjixVar = jpowsppfyaVar.f21406zoijcleaow;
        if (obj != pkzmftpjixVar) {
            return -1;
        }
        Iterator it = pkzmftpjixVar.iobyxmoadg().iterator();
        while (it.hasNext()) {
            if (((com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz) it.next()) == jpowsppfyaVar) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    private com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt lqeggnwhkg(wkgbmnqykc wkgbmnqykcVar) throws com.caverock.androidsvg.iobyxmoadg {
        com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar = new com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt();
        do {
            String strWwaezpbzkn = wkgbmnqykcVar.wwaezpbzkn();
            wkgbmnqykcVar.pmvmpeiblj();
            if (!wkgbmnqykcVar.gxszxtbevo(':')) {
                throw new com.caverock.androidsvg.iobyxmoadg("Expected ':'");
            }
            wkgbmnqykcVar.pmvmpeiblj();
            String strPkzmftpjix = wkgbmnqykcVar.pkzmftpjix();
            if (strPkzmftpjix == null) {
                throw new com.caverock.androidsvg.iobyxmoadg("Expected property value");
            }
            wkgbmnqykcVar.pmvmpeiblj();
            if (wkgbmnqykcVar.gxszxtbevo('!')) {
                wkgbmnqykcVar.pmvmpeiblj();
                if (!wkgbmnqykcVar.lqeggnwhkg("important")) {
                    throw new com.caverock.androidsvg.iobyxmoadg("Malformed rule set: found unexpected '!'");
                }
                wkgbmnqykcVar.pmvmpeiblj();
            }
            wkgbmnqykcVar.gxszxtbevo(';');
            com.caverock.androidsvg.dxjokdxxww.yzdjzghtvl(yadqdtsiqtVar, strWwaezpbzkn, strPkzmftpjix);
            wkgbmnqykcVar.pmvmpeiblj();
            if (wkgbmnqykcVar.nufgyqmvbu()) {
                break;
            }
        } while (!wkgbmnqykcVar.gxszxtbevo('}'));
        return yadqdtsiqtVar;
    }

    private static List nufgyqmvbu(wkgbmnqykc wkgbmnqykcVar) {
        String strIwizpuwonk;
        ArrayList arrayList = new ArrayList();
        while (!wkgbmnqykcVar.nufgyqmvbu() && (strIwizpuwonk = wkgbmnqykcVar.iwizpuwonk()) != null) {
            try {
                arrayList.add(gxszxtbevo.valueOf(strIwizpuwonk));
            } catch (IllegalArgumentException unused) {
            }
            if (!wkgbmnqykcVar.lereixgezr()) {
                break;
            }
        }
        return arrayList;
    }

    private void ojitshcjhn(wkgbmnqykc wkgbmnqykcVar) {
        int i13 = 0;
        while (!wkgbmnqykcVar.nufgyqmvbu()) {
            int iIntValue = wkgbmnqykcVar.draadjrbmk().intValue();
            if (iIntValue == 59 && i13 == 0) {
                return;
            }
            if (iIntValue == 123) {
                i13++;
            } else if (iIntValue == 125 && i13 > 0 && (i13 = i13 - 1) == 0) {
                return;
            }
        }
    }

    private static boolean ppxfxbqfkf(List list, gxszxtbevo gxszxtbevoVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gxszxtbevo gxszxtbevoVar2 = (gxszxtbevo) it.next();
            if (gxszxtbevoVar2 == gxszxtbevo.all || gxszxtbevoVar2 == gxszxtbevoVar) {
                return true;
            }
        }
        return false;
    }

    private static void rgvfuqvkyq(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    private static boolean wflxmlrfwp(vdvldrhtss vdvldrhtssVar, kcexrzcfyt kcexrzcfytVar, int i13, List list, int i14) {
        zdlpuopuiu zdlpuopuiuVarEablkybsjg = kcexrzcfytVar.eablkybsjg(i13);
        com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar = (com.caverock.androidsvg.lqeggnwhkg.jpowsppfya) list.get(i14);
        if (!agtfadlqog(vdvldrhtssVar, zdlpuopuiuVarEablkybsjg, list, i14, jpowsppfyaVar)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = zdlpuopuiuVarEablkybsjg.f21751iobyxmoadg;
        if (eablkybsjgVar == eablkybsjg.DESCENDANT) {
            if (i13 == 0) {
                return true;
            }
            while (i14 > 0) {
                i14--;
                if (wflxmlrfwp(vdvldrhtssVar, kcexrzcfytVar, i13 - 1, list, i14)) {
                    return true;
                }
            }
            return false;
        }
        if (eablkybsjgVar == eablkybsjg.CHILD) {
            return wflxmlrfwp(vdvldrhtssVar, kcexrzcfytVar, i13 - 1, list, i14 - 1);
        }
        int iIobyxmoadg = iobyxmoadg(list, i14, jpowsppfyaVar);
        if (iIobyxmoadg <= 0) {
            return false;
        }
        return gtknphoqwx(vdvldrhtssVar, kcexrzcfytVar, i13 - 1, list, i14, (com.caverock.androidsvg.lqeggnwhkg.jpowsppfya) jpowsppfyaVar.f21406zoijcleaow.iobyxmoadg().get(iIobyxmoadg - 1));
    }

    static boolean zoijcleaow(String str, gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(str);
        wkgbmnqykcVar.pmvmpeiblj();
        return ppxfxbqfkf(nufgyqmvbu(wkgbmnqykcVar), gxszxtbevoVar);
    }

    oxmwwwfdhm wkgbmnqykc(String str) {
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(str);
        wkgbmnqykcVar.pmvmpeiblj();
        return btonecajqb(wkgbmnqykcVar);
    }

    zoijcleaow(gxszxtbevo gxszxtbevoVar, yggfygwlhe yggfygwlheVar) {
        this.f21678ppxfxbqfkf = false;
        this.f21677iobyxmoadg = gxszxtbevoVar;
        this.f21679zoijcleaow = yggfygwlheVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class kcexrzcfyt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        List f21727iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f21728zoijcleaow;

        private kcexrzcfyt() {
            this.f21727iobyxmoadg = null;
            this.f21728zoijcleaow = 0;
        }

        zdlpuopuiu eablkybsjg(int i13) {
            return (zdlpuopuiu) this.f21727iobyxmoadg.get(i13);
        }

        boolean gxszxtbevo() {
            List list = this.f21727iobyxmoadg;
            return list == null || list.isEmpty();
        }

        void iobyxmoadg(zdlpuopuiu zdlpuopuiuVar) {
            if (this.f21727iobyxmoadg == null) {
                this.f21727iobyxmoadg = new ArrayList();
            }
            this.f21727iobyxmoadg.add(zdlpuopuiuVar);
        }

        int lqeggnwhkg() {
            List list = this.f21727iobyxmoadg;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        void ppxfxbqfkf() {
            this.f21728zoijcleaow++;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            Iterator it = this.f21727iobyxmoadg.iterator();
            while (it.hasNext()) {
                sb3.append((zdlpuopuiu) it.next());
                sb3.append(' ');
            }
            sb3.append('[');
            sb3.append(this.f21728zoijcleaow);
            sb3.append(']');
            return sb3.toString();
        }

        void wkgbmnqykc() {
            this.f21728zoijcleaow += 1000000;
        }

        void zoijcleaow() {
            this.f21728zoijcleaow += 1000;
        }

        /* synthetic */ kcexrzcfyt(iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }
}
