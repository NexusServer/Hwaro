package nexus;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.Listener;
import cn.nukkit.block.Block;
import cn.nukkit.event.player.PlayerInteractEvent;
import cn.nukkit.event.EventHandler;
import cn.nukkit.Player;
import cn.nukkit.item.Item;

public class Hwaro extends PluginBase implements Listener{
   
   @Override
   public void onEnable(){
   	  this.getServer().getPluginManager().registerEvents(this,this);
   }
   @EventHandler
   public void onTouch(PlayerInteractEvent event){
   	  Block block=event.getBlock();
   	  Player player=event.getPlayer();
   	  int BLOCK_ID=block.getId();
   	  int id=event.getItem().getId();
   	  int damage=event.getItem().getDamage();
   	  int count=event.getItem().getCount();
   	  if(event.isCancelled()){
   	  	 event.setCancelled(false);
   	  }
   	  if(BLOCK_ID==61||BLOCK_ID==62){
   	  	 if(!player.getInventory().contains(new Item(263))){
   	  	 	 player.sendPopup("§e원석을 들고 있지 않거나 석탄이 부족합니다.");
   	  	 	 event.setCancelled();
   	  	 }
   	  	 else{
   	  	 switch(id){
   	  	 	 case 14:
   	  	 	 player.getInventory().addItem(new Item(266));
   	  	 	 player.getInventory().removeItem(new Item(263));
   	  	 	 player.getInventory().removeItem(new Item(id,damage,1));
   	  	 	 break;
   	  	 	 case 15:
   	  	 	 player.getInventory().addItem(new Item(265));
   	  	 	 player.getInventory().removeItem(new Item(263));
   	  	 	 player.getInventory().removeItem(new Item(id,damage,1));
   	  	 	 break;
   	  	 	 case 16:
   	  	 	 player.getInventory().addItem(new Item(263));
   	  	 	 player.getInventory().removeItem(new Item(263));
   	  	 	 player.getInventory().removeItem(new Item(id,damage,1));
   	  	 	 break;
   	  	 	 case 21:
   	  	 	 player.getInventory().addItem(new Item(351,4));
   	  	 	 player.getInventory().removeItem(new Item(263));
   	  	 	 player.getInventory().removeItem(new Item(id,damage,1));
   	  	 	 break;
   	  	 	 case 56:
   	  	 	 player.getInventory().addItem(new Item(264));
   	  	 	 player.getInventory().removeItem(new Item(263));
   	  	 	 player.getInventory().removeItem(new Item(id,damage,1));
   	  	 	 break;
   	  	 	 case 73:
   	  	 	 player.getInventory().addItem(new Item(331));
   	  	 	 player.getInventory().removeItem(new Item(263));
   	  	 	 player.getInventory().removeItem(new Item(id,damage,1));
   	  	 	 break;
   	  	 	 case 129:
   	  	 	 player.getInventory().addItem(new Item(388));
   	  	 	 player.getInventory().removeItem(new Item(263));
   	  	 	 player.getInventory().removeItem(new Item(id,damage,1));
   	  	 	 break;
   	  	 	 case 153:
   	  	 	 player.getInventory().addItem(new Item(406));
   	  	 	 player.getInventory().removeItem(new Item(263));
   	  	 	 player.getInventory().removeItem(new Item(id,damage,1));
   	  	 	 break;
   	  	 	 default:
   	  	 	 player.sendPopup("§7광석을 터치하여 녹일수 있습니다.");
   	  	 	 break;
   	  	 }
   	  	 	 event.setCancelled();
   	  	 }
   	  }
   }
}