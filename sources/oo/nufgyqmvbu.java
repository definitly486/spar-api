package oo;

import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu extends w32.iobyxmoadg {

    public static final class iobyxmoadg extends nufgyqmvbu {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public static final iobyxmoadg f73286gxszxtbevo = new iobyxmoadg();

        private iobyxmoadg() {
            super("search_screen_load", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -104211019;
        }
    }

    public /* synthetic */ nufgyqmvbu(String str, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    public static final class zoijcleaow extends nufgyqmvbu {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final Map f73287gxszxtbevo;

        public /* synthetic */ zoijcleaow(Map map, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? tzroggbefp.dxjokdxxww() : map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f73287gxszxtbevo, ((zoijcleaow) obj).f73287gxszxtbevo);
        }

        public int hashCode() {
            return this.f73287gxszxtbevo.hashCode();
        }

        @Override // w32.iobyxmoadg
        protected Map wkgbmnqykc() {
            return this.f73287gxszxtbevo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Map specificArgs) {
            super("search_screen_load_result", null);
            zdlpuopuiu.btonecajqb(specificArgs, "specificArgs");
            this.f73287gxszxtbevo = specificArgs;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String searchQuery) {
            this(tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg("search_query", searchQuery)));
            zdlpuopuiu.btonecajqb(searchQuery, "searchQuery");
        }
    }

    private nufgyqmvbu(String str) {
        super(str, null, 2, null);
    }
}
