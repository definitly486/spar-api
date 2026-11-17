package kx0;

import cy0.CommentReferencesDto;
import dx0.CommentReferencesEntity;
import dx0.ReferenceEntity;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jx0.draadjrbmk;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.cart.CommentReferences;
import ru.myspar.proloyalty.core.domain.models.reference.Reference;
import zx0.ReferenceDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lqeggnwhkg {
    public static final CommentReferences iobyxmoadg(CommentReferencesDto commentReferencesDto) {
        zdlpuopuiu.btonecajqb(commentReferencesDto, "<this>");
        String code = commentReferencesDto.getCode();
        String title = commentReferencesDto.getTitle();
        List items = commentReferencesDto.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(draadjrbmk.zoijcleaow((ReferenceDto) it.next()));
        }
        return new CommentReferences(code, title, arrayList);
    }

    public static final CommentReferencesEntity ppxfxbqfkf(CommentReferences commentReferences) {
        zdlpuopuiu.btonecajqb(commentReferences, "<this>");
        String code = commentReferences.getCode();
        String title = commentReferences.getTitle();
        List items = commentReferences.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(draadjrbmk.wkgbmnqykc((Reference) it.next()));
        }
        return new CommentReferencesEntity(code, title, arrayList);
    }

    public static final CommentReferences zoijcleaow(CommentReferencesEntity commentReferencesEntity) {
        zdlpuopuiu.btonecajqb(commentReferencesEntity, "<this>");
        String code = commentReferencesEntity.getCode();
        String title = commentReferencesEntity.getTitle();
        List items = commentReferencesEntity.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(draadjrbmk.iobyxmoadg((ReferenceEntity) it.next()));
        }
        return new CommentReferences(code, title, arrayList);
    }
}
