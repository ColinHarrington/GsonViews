package gsonplugin

class PluginController {
	def appTemplate(){
		render(view: '/app/appTemplate')
	}

	def appView(){
		render(view: '/app/appView')
	}

	def pluginTemplate(){
		respond [:]
	}

	def pluginView(){
		respond [:]
	}
}