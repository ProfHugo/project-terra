package profhugo.terra.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import profhugo.terra.capabilities.Stamina;

public class StaminaGui extends Gui {

	String text = "Stamina: ";

	public StaminaGui(Minecraft mc) {
		
	}

	public void updateStamina(float stamina, Minecraft mc) {
		text = String.format("Stamina: %d/%d", (int) stamina, (int) Stamina.MAX_STAMINA);
		ScaledResolution scaled = new ScaledResolution(mc);
		int width = scaled.getScaledWidth();
		int height = scaled.getScaledHeight();
		this.drawCenteredString(mc.fontRendererObj, text, width / 2, (height / 2) + (height / 4),
				Integer.parseInt("26b52f", 16));
	}

	public void removeGui() {
	 
	}
}