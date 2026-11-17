package y72;

import bk.wflxmlrfwp;
import ek.wkgbmnqykc;
import fk.dvvnrvtcbc;
import fk.gxszxtbevo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: y72.iobyxmoadg, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@wflxmlrfwp
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002\u001c\u001eB+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Ly72/iobyxmoadg;", "", "", "seen0", "", "Ly72/zoijcleaow;", "stories", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(Ly72/iobyxmoadg;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Ljava/util/List;", "zoijcleaow", "()Ljava/util/List;", "getStories$annotations", "()V", "Companion", "story_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StoriesListDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final bk.zoijcleaow[] f124035zoijcleaow = {new gxszxtbevo(StoryItemDto.iobyxmoadg.f124053iobyxmoadg)};

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final List stories;

    /* JADX INFO: renamed from: y72.iobyxmoadg$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return C3134iobyxmoadg.f124037iobyxmoadg;
        }

        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ StoriesListDto(int i13, List list, dvvnrvtcbc dvvnrvtcbcVar) {
        if ((i13 & 1) == 0) {
            this.stories = null;
        } else {
            this.stories = list;
        }
    }

    public static final /* synthetic */ void ppxfxbqfkf(StoriesListDto self, wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        bk.zoijcleaow[] zoijcleaowVarArr = f124035zoijcleaow;
        if (!output.zdlpuopuiu(serialDesc, 0) && self.stories == null) {
            return;
        }
        output.yggfygwlhe(serialDesc, 0, zoijcleaowVarArr[0], self.stories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StoriesListDto) && zdlpuopuiu.eablkybsjg(this.stories, ((StoriesListDto) other).stories);
    }

    public int hashCode() {
        List list = this.stories;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "StoriesListDto(stories=" + this.stories + ")";
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final List getStories() {
        return this.stories;
    }
}
