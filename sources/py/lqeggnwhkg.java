package py;

import gz.ReferenceDto;
import hg.jyumaefscl;
import iy.CommentReferencesEntity;
import iy.ReferenceEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import kz.CommentReferencesDto;
import oy.draadjrbmk;
import ru.myspar.core.domain.models.cart.CommentReferences;
import ru.myspar.core.domain.models.reference.Reference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lqeggnwhkg {
    public static final CommentReferences iobyxmoadg(CommentReferencesEntity commentReferencesEntity) {
        zdlpuopuiu.btonecajqb(commentReferencesEntity, "<this>");
        String code = commentReferencesEntity.getCode();
        String title = commentReferencesEntity.getTitle();
        List items = commentReferencesEntity.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(draadjrbmk.zoijcleaow((ReferenceEntity) it.next()));
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

    public static final CommentReferences zoijcleaow(CommentReferencesDto commentReferencesDto) {
        zdlpuopuiu.btonecajqb(commentReferencesDto, "<this>");
        String code = commentReferencesDto.getCode();
        String title = commentReferencesDto.getTitle();
        List items = commentReferencesDto.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(draadjrbmk.iobyxmoadg((ReferenceDto) it.next()));
        }
        return new CommentReferences(code, title, arrayList);
    }
}
