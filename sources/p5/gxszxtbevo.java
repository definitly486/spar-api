package p5;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final zoijcleaow f75608eablkybsjg = new zoijcleaow(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f75609iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Set f75610ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Set f75611wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Map f75612zoijcleaow;

    public static final class eablkybsjg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final iobyxmoadg f75613eablkybsjg = new iobyxmoadg(null);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final String f75614iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final List f75615ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public List f75616wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final boolean f75617zoijcleaow;

        public static final class iobyxmoadg {
            public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
                this();
            }

            private iobyxmoadg() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public eablkybsjg(String name, boolean z13, List columns, List orders) {
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(columns, "columns");
            zdlpuopuiu.btonecajqb(orders, "orders");
            this.f75614iobyxmoadg = name;
            this.f75617zoijcleaow = z13;
            this.f75615ppxfxbqfkf = columns;
            this.f75616wkgbmnqykc = orders;
            if (orders.isEmpty()) {
                int size = columns.size();
                orders = new ArrayList(size);
                for (int i13 = 0; i13 < size; i13++) {
                    orders.add(n5.gtknphoqwx.ASC.name());
                }
            }
            this.f75616wkgbmnqykc = orders;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            if (this.f75617zoijcleaow == eablkybsjgVar.f75617zoijcleaow && zdlpuopuiu.eablkybsjg(this.f75615ppxfxbqfkf, eablkybsjgVar.f75615ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f75616wkgbmnqykc, eablkybsjgVar.f75616wkgbmnqykc)) {
                return kcexrzcfyt.stevsuqkhv(this.f75614iobyxmoadg, "index_", false, 2, null) ? kcexrzcfyt.stevsuqkhv(eablkybsjgVar.f75614iobyxmoadg, "index_", false, 2, null) : zdlpuopuiu.eablkybsjg(this.f75614iobyxmoadg, eablkybsjgVar.f75614iobyxmoadg);
            }
            return false;
        }

        public int hashCode() {
            return ((((((kcexrzcfyt.stevsuqkhv(this.f75614iobyxmoadg, "index_", false, 2, null) ? -1184239155 : this.f75614iobyxmoadg.hashCode()) * 31) + (this.f75617zoijcleaow ? 1 : 0)) * 31) + this.f75615ppxfxbqfkf.hashCode()) * 31) + this.f75616wkgbmnqykc.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f75614iobyxmoadg + "', unique=" + this.f75617zoijcleaow + ", columns=" + this.f75615ppxfxbqfkf + ", orders=" + this.f75616wkgbmnqykc + "'}";
        }
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public static final C1666iobyxmoadg f75618nufgyqmvbu = new C1666iobyxmoadg(null);

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final String f75619eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final int f75620gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final String f75621iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public final int f75622lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final boolean f75623ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final int f75624wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final String f75625zoijcleaow;

        /* JADX INFO: renamed from: p5.gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1666iobyxmoadg {
            public /* synthetic */ C1666iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
                this();
            }

            private final boolean iobyxmoadg(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i13 < str.length()) {
                    char cCharAt = str.charAt(i13);
                    int i16 = i15 + 1;
                    if (i15 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i14++;
                    } else if (cCharAt == ')' && (i14 = i14 - 1) == 0 && i15 != str.length() - 1) {
                        return false;
                    }
                    i13++;
                    i15 = i16;
                }
                return i14 == 0;
            }

            public final boolean zoijcleaow(String current, String str) {
                zdlpuopuiu.btonecajqb(current, "current");
                if (zdlpuopuiu.eablkybsjg(current, str)) {
                    return true;
                }
                if (!iobyxmoadg(current)) {
                    return false;
                }
                String strSubstring = current.substring(1, current.length() - 1);
                zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return zdlpuopuiu.eablkybsjg(kcexrzcfyt.p(strSubstring).toString(), str);
            }

            private C1666iobyxmoadg() {
            }
        }

        public iobyxmoadg(String name, String type, boolean z13, int i13, String str, int i14) {
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(type, "type");
            this.f75621iobyxmoadg = name;
            this.f75625zoijcleaow = type;
            this.f75623ppxfxbqfkf = z13;
            this.f75624wkgbmnqykc = i13;
            this.f75619eablkybsjg = str;
            this.f75620gxszxtbevo = i14;
            this.f75622lqeggnwhkg = iobyxmoadg(type);
        }

        private final int iobyxmoadg(String str) {
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            zdlpuopuiu.dxjokdxxww(US, "US");
            String upperCase = str.toUpperCase(US);
            zdlpuopuiu.dxjokdxxww(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (kcexrzcfyt.sopmlzcsov(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (kcexrzcfyt.sopmlzcsov(upperCase, "CHAR", false, 2, null) || kcexrzcfyt.sopmlzcsov(upperCase, "CLOB", false, 2, null) || kcexrzcfyt.sopmlzcsov(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (kcexrzcfyt.sopmlzcsov(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (kcexrzcfyt.sopmlzcsov(upperCase, "REAL", false, 2, null) || kcexrzcfyt.sopmlzcsov(upperCase, "FLOA", false, 2, null) || kcexrzcfyt.sopmlzcsov(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg) || this.f75624wkgbmnqykc != ((iobyxmoadg) obj).f75624wkgbmnqykc) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            if (!zdlpuopuiu.eablkybsjg(this.f75621iobyxmoadg, iobyxmoadgVar.f75621iobyxmoadg) || this.f75623ppxfxbqfkf != iobyxmoadgVar.f75623ppxfxbqfkf) {
                return false;
            }
            if (this.f75620gxszxtbevo == 1 && iobyxmoadgVar.f75620gxszxtbevo == 2 && (str3 = this.f75619eablkybsjg) != null && !f75618nufgyqmvbu.zoijcleaow(str3, iobyxmoadgVar.f75619eablkybsjg)) {
                return false;
            }
            if (this.f75620gxszxtbevo == 2 && iobyxmoadgVar.f75620gxszxtbevo == 1 && (str2 = iobyxmoadgVar.f75619eablkybsjg) != null && !f75618nufgyqmvbu.zoijcleaow(str2, this.f75619eablkybsjg)) {
                return false;
            }
            int i13 = this.f75620gxszxtbevo;
            return (i13 == 0 || i13 != iobyxmoadgVar.f75620gxszxtbevo || ((str = this.f75619eablkybsjg) == null ? iobyxmoadgVar.f75619eablkybsjg == null : f75618nufgyqmvbu.zoijcleaow(str, iobyxmoadgVar.f75619eablkybsjg))) && this.f75622lqeggnwhkg == iobyxmoadgVar.f75622lqeggnwhkg;
        }

        public int hashCode() {
            return (((((this.f75621iobyxmoadg.hashCode() * 31) + this.f75622lqeggnwhkg) * 31) + (this.f75623ppxfxbqfkf ? 1231 : 1237)) * 31) + this.f75624wkgbmnqykc;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Column{name='");
            sb3.append(this.f75621iobyxmoadg);
            sb3.append("', type='");
            sb3.append(this.f75625zoijcleaow);
            sb3.append("', affinity='");
            sb3.append(this.f75622lqeggnwhkg);
            sb3.append("', notNull=");
            sb3.append(this.f75623ppxfxbqfkf);
            sb3.append(", primaryKeyPosition=");
            sb3.append(this.f75624wkgbmnqykc);
            sb3.append(", defaultValue='");
            String str = this.f75619eablkybsjg;
            if (str == null) {
                str = StringUtils.UNDEFINED;
            }
            sb3.append(str);
            sb3.append("'}");
            return sb3.toString();
        }
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final List f75626eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final String f75627iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final String f75628ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final List f75629wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final String f75630zoijcleaow;

        public ppxfxbqfkf(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
            zdlpuopuiu.btonecajqb(referenceTable, "referenceTable");
            zdlpuopuiu.btonecajqb(onDelete, "onDelete");
            zdlpuopuiu.btonecajqb(onUpdate, "onUpdate");
            zdlpuopuiu.btonecajqb(columnNames, "columnNames");
            zdlpuopuiu.btonecajqb(referenceColumnNames, "referenceColumnNames");
            this.f75627iobyxmoadg = referenceTable;
            this.f75630zoijcleaow = onDelete;
            this.f75628ppxfxbqfkf = onUpdate;
            this.f75629wkgbmnqykc = columnNames;
            this.f75626eablkybsjg = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            if (zdlpuopuiu.eablkybsjg(this.f75627iobyxmoadg, ppxfxbqfkfVar.f75627iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f75630zoijcleaow, ppxfxbqfkfVar.f75630zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f75628ppxfxbqfkf, ppxfxbqfkfVar.f75628ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f75629wkgbmnqykc, ppxfxbqfkfVar.f75629wkgbmnqykc)) {
                return zdlpuopuiu.eablkybsjg(this.f75626eablkybsjg, ppxfxbqfkfVar.f75626eablkybsjg);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f75627iobyxmoadg.hashCode() * 31) + this.f75630zoijcleaow.hashCode()) * 31) + this.f75628ppxfxbqfkf.hashCode()) * 31) + this.f75629wkgbmnqykc.hashCode()) * 31) + this.f75626eablkybsjg.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f75627iobyxmoadg + "', onDelete='" + this.f75630zoijcleaow + " +', onUpdate='" + this.f75628ppxfxbqfkf + "', columnNames=" + this.f75629wkgbmnqykc + ", referenceColumnNames=" + this.f75626eablkybsjg + '}';
        }
    }

    public static final class wkgbmnqykc implements Comparable {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final String f75631iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final String f75632jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f75633yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f75634zdlpuopuiu;

        public wkgbmnqykc(int i13, int i14, String from, String to2) {
            zdlpuopuiu.btonecajqb(from, "from");
            zdlpuopuiu.btonecajqb(to2, "to");
            this.f75634zdlpuopuiu = i13;
            this.f75633yggfygwlhe = i14;
            this.f75632jyumaefscl = from;
            this.f75631iwizpuwonk = to2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compareTo(wkgbmnqykc other) {
            zdlpuopuiu.btonecajqb(other, "other");
            int i13 = this.f75634zdlpuopuiu - other.f75634zdlpuopuiu;
            return i13 == 0 ? this.f75633yggfygwlhe - other.f75633yggfygwlhe : i13;
        }

        public final int ppxfxbqfkf() {
            return this.f75634zdlpuopuiu;
        }

        public final String wkgbmnqykc() {
            return this.f75631iwizpuwonk;
        }

        public final String zoijcleaow() {
            return this.f75632jyumaefscl;
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final gxszxtbevo iobyxmoadg(u5.lqeggnwhkg database, String tableName) {
            zdlpuopuiu.btonecajqb(database, "database");
            zdlpuopuiu.btonecajqb(tableName, "tableName");
            return lqeggnwhkg.gxszxtbevo(database, tableName);
        }

        private zoijcleaow() {
        }
    }

    public gxszxtbevo(String name, Map columns, Set foreignKeys, Set set) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(columns, "columns");
        zdlpuopuiu.btonecajqb(foreignKeys, "foreignKeys");
        this.f75609iobyxmoadg = name;
        this.f75612zoijcleaow = columns;
        this.f75610ppxfxbqfkf = foreignKeys;
        this.f75611wkgbmnqykc = set;
    }

    public static final gxszxtbevo iobyxmoadg(u5.lqeggnwhkg lqeggnwhkgVar, String str) {
        return f75608eablkybsjg.iobyxmoadg(lqeggnwhkgVar, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        if (!zdlpuopuiu.eablkybsjg(this.f75609iobyxmoadg, gxszxtbevoVar.f75609iobyxmoadg) || !zdlpuopuiu.eablkybsjg(this.f75612zoijcleaow, gxszxtbevoVar.f75612zoijcleaow) || !zdlpuopuiu.eablkybsjg(this.f75610ppxfxbqfkf, gxszxtbevoVar.f75610ppxfxbqfkf)) {
            return false;
        }
        Set set2 = this.f75611wkgbmnqykc;
        if (set2 == null || (set = gxszxtbevoVar.f75611wkgbmnqykc) == null) {
            return true;
        }
        return zdlpuopuiu.eablkybsjg(set2, set);
    }

    public int hashCode() {
        return (((this.f75609iobyxmoadg.hashCode() * 31) + this.f75612zoijcleaow.hashCode()) * 31) + this.f75610ppxfxbqfkf.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f75609iobyxmoadg + "', columns=" + this.f75612zoijcleaow + ", foreignKeys=" + this.f75610ppxfxbqfkf + ", indices=" + this.f75611wkgbmnqykc + '}';
    }
}
