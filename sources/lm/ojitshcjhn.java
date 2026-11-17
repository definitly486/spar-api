package lm;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import lk.esjtqupxsv;
import lk.istkbnxepw;

/* JADX INFO: loaded from: classes3.dex */
abstract class ojitshcjhn {

    static final class agtfadlqog extends ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final lm.gxszxtbevo f63469iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f63470zoijcleaow;

        agtfadlqog(lm.gxszxtbevo gxszxtbevoVar, boolean z13) {
            this.f63469iobyxmoadg = gxszxtbevoVar;
            this.f63470zoijcleaow = z13;
        }

        @Override // lm.ojitshcjhn
        void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, Object obj) {
            if (obj == null) {
                return;
            }
            vdvldrhtssVar.lqeggnwhkg((String) this.f63469iobyxmoadg.convert(obj), null, this.f63470zoijcleaow);
        }
    }

    static final class btonecajqb extends ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Method f63471iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final lm.gxszxtbevo f63472ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f63473wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f63474zoijcleaow;

        btonecajqb(Method method, int i13, lm.gxszxtbevo gxszxtbevoVar, String str) {
            this.f63471iobyxmoadg = method;
            this.f63474zoijcleaow = i13;
            this.f63472ppxfxbqfkf = gxszxtbevoVar;
            this.f63473wkgbmnqykc = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // lm.ojitshcjhn
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, Map map) {
            if (map == null) {
                throw cqumvgiudr.ojitshcjhn(this.f63471iobyxmoadg, this.f63474zoijcleaow, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw cqumvgiudr.ojitshcjhn(this.f63471iobyxmoadg, this.f63474zoijcleaow, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw cqumvgiudr.ojitshcjhn(this.f63471iobyxmoadg, this.f63474zoijcleaow, "Part map contained null value for key '" + str + "'.", new Object[0]);
                }
                vdvldrhtssVar.wkgbmnqykc(lk.yggfygwlhe.gxszxtbevo("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f63473wkgbmnqykc), (istkbnxepw) this.f63472ppxfxbqfkf.convert(value));
            }
        }
    }

    static final class draadjrbmk extends ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f63475iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f63476ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final lm.gxszxtbevo f63477zoijcleaow;

        draadjrbmk(String str, lm.gxszxtbevo gxszxtbevoVar, boolean z13) {
            Objects.requireNonNull(str, "name == null");
            this.f63475iobyxmoadg = str;
            this.f63477zoijcleaow = gxszxtbevoVar;
            this.f63476ppxfxbqfkf = z13;
        }

        @Override // lm.ojitshcjhn
        void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f63477zoijcleaow.convert(obj)) == null) {
                return;
            }
            vdvldrhtssVar.lqeggnwhkg(this.f63475iobyxmoadg, str, this.f63476ppxfxbqfkf);
        }
    }

    static final class dxjokdxxww extends ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Method f63478iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final lk.yggfygwlhe f63479ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final lm.gxszxtbevo f63480wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f63481zoijcleaow;

        dxjokdxxww(Method method, int i13, lk.yggfygwlhe yggfygwlheVar, lm.gxszxtbevo gxszxtbevoVar) {
            this.f63478iobyxmoadg = method;
            this.f63481zoijcleaow = i13;
            this.f63479ppxfxbqfkf = yggfygwlheVar;
            this.f63480wkgbmnqykc = gxszxtbevoVar;
        }

        @Override // lm.ojitshcjhn
        void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, Object obj) {
            if (obj == null) {
                return;
            }
            try {
                vdvldrhtssVar.wkgbmnqykc(this.f63479ppxfxbqfkf, (istkbnxepw) this.f63480wkgbmnqykc.convert(obj));
            } catch (IOException e13) {
                throw cqumvgiudr.ojitshcjhn(this.f63478iobyxmoadg, this.f63481zoijcleaow, "Unable to convert " + obj + " to RequestBody", e13);
            }
        }
    }

    static final class eablkybsjg extends ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Method f63482iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final lm.gxszxtbevo f63483ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f63484wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f63485zoijcleaow;

        eablkybsjg(Method method, int i13, lm.gxszxtbevo gxszxtbevoVar, boolean z13) {
            this.f63482iobyxmoadg = method;
            this.f63485zoijcleaow = i13;
            this.f63483ppxfxbqfkf = gxszxtbevoVar;
            this.f63484wkgbmnqykc = z13;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // lm.ojitshcjhn
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, Map map) {
            if (map == null) {
                throw cqumvgiudr.ojitshcjhn(this.f63482iobyxmoadg, this.f63485zoijcleaow, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw cqumvgiudr.ojitshcjhn(this.f63482iobyxmoadg, this.f63485zoijcleaow, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw cqumvgiudr.ojitshcjhn(this.f63482iobyxmoadg, this.f63485zoijcleaow, "Field map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f63483ppxfxbqfkf.convert(value);
                if (str2 == null) {
                    throw cqumvgiudr.ojitshcjhn(this.f63482iobyxmoadg, this.f63485zoijcleaow, "Field map value '" + value + "' converted to null by " + this.f63483ppxfxbqfkf.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                vdvldrhtssVar.iobyxmoadg(str, str2, this.f63484wkgbmnqykc);
            }
        }
    }

    static final class gtknphoqwx extends ojitshcjhn {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f63486eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Method f63487iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f63488ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final lm.gxszxtbevo f63489wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f63490zoijcleaow;

        gtknphoqwx(Method method, int i13, String str, lm.gxszxtbevo gxszxtbevoVar, boolean z13) {
            this.f63487iobyxmoadg = method;
            this.f63490zoijcleaow = i13;
            Objects.requireNonNull(str, "name == null");
            this.f63488ppxfxbqfkf = str;
            this.f63489wkgbmnqykc = gxszxtbevoVar;
            this.f63486eablkybsjg = z13;
        }

        @Override // lm.ojitshcjhn
        void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, Object obj) {
            if (obj != null) {
                vdvldrhtssVar.gxszxtbevo(this.f63488ppxfxbqfkf, (String) this.f63489wkgbmnqykc.convert(obj), this.f63486eablkybsjg);
                return;
            }
            throw cqumvgiudr.ojitshcjhn(this.f63487iobyxmoadg, this.f63490zoijcleaow, "Path parameter \"" + this.f63488ppxfxbqfkf + "\" value must not be null.", new Object[0]);
        }
    }

    static final class gxszxtbevo extends ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f63491iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final lm.gxszxtbevo f63492zoijcleaow;

        gxszxtbevo(String str, lm.gxszxtbevo gxszxtbevoVar) {
            Objects.requireNonNull(str, "name == null");
            this.f63491iobyxmoadg = str;
            this.f63492zoijcleaow = gxszxtbevoVar;
        }

        @Override // lm.ojitshcjhn
        void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f63492zoijcleaow.convert(obj)) == null) {
                return;
            }
            vdvldrhtssVar.zoijcleaow(this.f63491iobyxmoadg, str);
        }
    }

    class iobyxmoadg extends ojitshcjhn {
        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // lm.ojitshcjhn
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, Iterable iterable) {
            if (iterable == null) {
                return;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ojitshcjhn.this.iobyxmoadg(vdvldrhtssVar, it.next());
            }
        }
    }

    static final class lqeggnwhkg extends ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Method f63494iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final lm.gxszxtbevo f63495ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f63496zoijcleaow;

        lqeggnwhkg(Method method, int i13, lm.gxszxtbevo gxszxtbevoVar) {
            this.f63494iobyxmoadg = method;
            this.f63496zoijcleaow = i13;
            this.f63495ppxfxbqfkf = gxszxtbevoVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // lm.ojitshcjhn
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, Map map) {
            if (map == null) {
                throw cqumvgiudr.ojitshcjhn(this.f63494iobyxmoadg, this.f63496zoijcleaow, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw cqumvgiudr.ojitshcjhn(this.f63494iobyxmoadg, this.f63496zoijcleaow, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw cqumvgiudr.ojitshcjhn(this.f63494iobyxmoadg, this.f63496zoijcleaow, "Header map contained null value for key '" + str + "'.", new Object[0]);
                }
                vdvldrhtssVar.zoijcleaow(str, (String) this.f63495ppxfxbqfkf.convert(value));
            }
        }
    }

    static final class nufgyqmvbu extends ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Method f63497iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f63498zoijcleaow;

        nufgyqmvbu(Method method, int i13) {
            this.f63497iobyxmoadg = method;
            this.f63498zoijcleaow = i13;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // lm.ojitshcjhn
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, lk.yggfygwlhe yggfygwlheVar) {
            if (yggfygwlheVar == null) {
                throw cqumvgiudr.ojitshcjhn(this.f63497iobyxmoadg, this.f63498zoijcleaow, "Headers parameter must not be null.", new Object[0]);
            }
            vdvldrhtssVar.ppxfxbqfkf(yggfygwlheVar);
        }
    }

    /* JADX INFO: renamed from: lm.ojitshcjhn$ojitshcjhn, reason: collision with other inner class name */
    static final class C1295ojitshcjhn extends ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final C1295ojitshcjhn f63499iobyxmoadg = new C1295ojitshcjhn();

        private C1295ojitshcjhn() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // lm.ojitshcjhn
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, esjtqupxsv.ppxfxbqfkf ppxfxbqfkfVar) {
            if (ppxfxbqfkfVar != null) {
                vdvldrhtssVar.eablkybsjg(ppxfxbqfkfVar);
            }
        }
    }

    static final class ppxfxbqfkf extends ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Method f63500iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final lm.gxszxtbevo f63501ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f63502zoijcleaow;

        ppxfxbqfkf(Method method, int i13, lm.gxszxtbevo gxszxtbevoVar) {
            this.f63500iobyxmoadg = method;
            this.f63502zoijcleaow = i13;
            this.f63501ppxfxbqfkf = gxszxtbevoVar;
        }

        @Override // lm.ojitshcjhn
        void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, Object obj) {
            if (obj == null) {
                throw cqumvgiudr.ojitshcjhn(this.f63500iobyxmoadg, this.f63502zoijcleaow, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                vdvldrhtssVar.draadjrbmk((istkbnxepw) this.f63501ppxfxbqfkf.convert(obj));
            } catch (IOException e13) {
                throw cqumvgiudr.rgvfuqvkyq(this.f63500iobyxmoadg, e13, this.f63502zoijcleaow, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
    }

    static final class rgvfuqvkyq extends ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Method f63503iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f63504zoijcleaow;

        rgvfuqvkyq(Method method, int i13) {
            this.f63503iobyxmoadg = method;
            this.f63504zoijcleaow = i13;
        }

        @Override // lm.ojitshcjhn
        void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, Object obj) {
            if (obj == null) {
                throw cqumvgiudr.ojitshcjhn(this.f63503iobyxmoadg, this.f63504zoijcleaow, "@Url parameter is null.", new Object[0]);
            }
            vdvldrhtssVar.wflxmlrfwp(obj);
        }
    }

    static final class vdvldrhtss extends ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Class f63505iobyxmoadg;

        vdvldrhtss(Class cls) {
            this.f63505iobyxmoadg = cls;
        }

        @Override // lm.ojitshcjhn
        void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, Object obj) {
            vdvldrhtssVar.nufgyqmvbu(this.f63505iobyxmoadg, obj);
        }
    }

    static final class wflxmlrfwp extends ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Method f63506iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final lm.gxszxtbevo f63507ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f63508wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f63509zoijcleaow;

        wflxmlrfwp(Method method, int i13, lm.gxszxtbevo gxszxtbevoVar, boolean z13) {
            this.f63506iobyxmoadg = method;
            this.f63509zoijcleaow = i13;
            this.f63507ppxfxbqfkf = gxszxtbevoVar;
            this.f63508wkgbmnqykc = z13;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // lm.ojitshcjhn
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, Map map) {
            if (map == null) {
                throw cqumvgiudr.ojitshcjhn(this.f63506iobyxmoadg, this.f63509zoijcleaow, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw cqumvgiudr.ojitshcjhn(this.f63506iobyxmoadg, this.f63509zoijcleaow, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw cqumvgiudr.ojitshcjhn(this.f63506iobyxmoadg, this.f63509zoijcleaow, "Query map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f63507ppxfxbqfkf.convert(value);
                if (str2 == null) {
                    throw cqumvgiudr.ojitshcjhn(this.f63506iobyxmoadg, this.f63509zoijcleaow, "Query map value '" + value + "' converted to null by " + this.f63507ppxfxbqfkf.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                vdvldrhtssVar.lqeggnwhkg(str, str2, this.f63508wkgbmnqykc);
            }
        }
    }

    static final class wkgbmnqykc extends ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f63510iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f63511ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final lm.gxszxtbevo f63512zoijcleaow;

        wkgbmnqykc(String str, lm.gxszxtbevo gxszxtbevoVar, boolean z13) {
            Objects.requireNonNull(str, "name == null");
            this.f63510iobyxmoadg = str;
            this.f63512zoijcleaow = gxszxtbevoVar;
            this.f63511ppxfxbqfkf = z13;
        }

        @Override // lm.ojitshcjhn
        void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f63512zoijcleaow.convert(obj)) == null) {
                return;
            }
            vdvldrhtssVar.iobyxmoadg(this.f63510iobyxmoadg, str, this.f63511ppxfxbqfkf);
        }
    }

    class zoijcleaow extends ojitshcjhn {
        zoijcleaow() {
        }

        @Override // lm.ojitshcjhn
        void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i13 = 0; i13 < length; i13++) {
                ojitshcjhn.this.iobyxmoadg(vdvldrhtssVar, Array.get(obj, i13));
            }
        }
    }

    ojitshcjhn() {
    }

    abstract void iobyxmoadg(lm.vdvldrhtss vdvldrhtssVar, Object obj);

    final ojitshcjhn ppxfxbqfkf() {
        return new iobyxmoadg();
    }

    final ojitshcjhn zoijcleaow() {
        return new zoijcleaow();
    }
}
