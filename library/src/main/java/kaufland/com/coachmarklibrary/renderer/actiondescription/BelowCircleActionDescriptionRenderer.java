package kaufland.com.coachmarklibrary.renderer.actiondescription;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by sbra0902 on 13.02.17.
 */

public class BelowCircleActionDescriptionRenderer implements ActionDescriptionRenderer {

    @Override
    public void render(RectF screenRectangle, RectF circleRectangle, View actionDescription, View actionArrow) {

        actionDescription.setX(circleRectangle.centerX() - (actionDescription.getWidth() / 2));
        actionDescription.setY(circleRectangle.bottom + actionArrow.getHeight());

        actionArrow.setRotation(270);
        actionArrow.setX(circleRectangle.centerX() - (actionArrow.getWidth() / 2));
        actionArrow.setY(circleRectangle.bottom);
    }

    @Override
    public boolean isRenderingPossible(RectF screenRectangle, RectF circleRectangle, Rect actionDescriptionRectangle, Rect actionArrowRectangle) {
        return actionDescriptionRectangle.width() < circleRectangle.centerX();
    }
}
