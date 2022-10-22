package telran.imagga.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
public class ColorDto {
    String closest_palette_color;
    String closest_palette_color_parent;
    double percent;

    @Override
    public String toString() {
	return "color name: " + closest_palette_color + "\t" + "parent color name: " + closest_palette_color_parent
		+ "\t" + "coverage percent: " + percent;
    }
}
